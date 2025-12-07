class Solution {
    public int countOdds(int low, int high) {
        // Total 
        int total = high - low + 1;
        
        // If 
        if (total % 2 == 0) {
            return total / 2;
        }
        
       
        return (low % 2 == 1) ? (total + 1) / 2 : total / 2;
    }
}