class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        
        long tot = 0;
        for (int v : nums) { tot += v;  }
        int tar = (int)(tot % p);
        
        if (tar == 0) return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        
        int res = n;
        long pre = 0;
        
        for (int i = 0; i < n; i++) {
            pre += nums[i];

            int cur = (int)(pre % p);
            
            int need = (cur - tar + p) % p;
        
            if (map.containsKey(need)) { res = Math.min(res, i - map.get(need));  }
            map.put(cur, i);
        }
        return res == n ? -1 : res;
    }
}
