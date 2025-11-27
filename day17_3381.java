class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        
      
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        
       
        long[] min = new long[k];
        for (int i = 0; i < k; i++) {
            min[i] = Long.MAX_VALUE;
        }
        
        long res = Long.MIN_VALUE;
        
        
        for (int i = 0; i <= n; i++) {
            int rem = i % k;
            
           
            if (min[rem] != Long.MAX_VALUE) {
                res = Math.max(res, pre[i] - min[rem]);
            }
            
          
            min[rem] = Math.min(min[rem], pre[i]);
        }
        
        return res;
    }
}