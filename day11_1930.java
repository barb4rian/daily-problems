class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        
        
        for (char c = 'a'; c <= 'z'; c++) {
            int l = s.indexOf(c);  
            int r = s.lastIndexOf(c);  

            if (l != -1 && l < r) { 
            Set<Character> mid = new HashSet<>();
                for (int i = l + 1; i < r; i++) {
                    mid.add(s.charAt(i));
                }
                ans += mid.size();
            }
        }
        
        return ans;
    }
}

