class Solution {
    public int minimumOperations(int[] nums) {
        int ops = 0;
        
        for (int n : nums) {
            int r = n % 3;
            if (r != 0) {
                ops += Math.min(r, 3 - r);
            }
        }
        
        return ops;
    }
}