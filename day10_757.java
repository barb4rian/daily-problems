import java.util.Arrays;

class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0]; 
            }
            return a[1] - b[1]; 
        });
        
        int result = 0;
        int first = -1;  
        int second = -1; 
        
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            
            
            if (first >= start && second >= start) {
                continue;
            }
           
            else if (first >= start) {
                result++;
                second = first;
                first = end;
            }
            
            else {
                result += 2;
                second = end - 1;
                first = end;
            }
        }
        
        return result;
    }
}