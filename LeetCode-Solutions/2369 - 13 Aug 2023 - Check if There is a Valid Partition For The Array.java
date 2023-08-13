/*
Runtime 9 ms
Beats 68.93%

Memory 56.6 MB
Beats 67.96%
*/

class Solution {
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp3 = new boolean[3];
        // boolean[] dp = new boolean[n+1];
        dp3[0] = true;
        for(int i=0; i<n; i++){
            int j = i+1;
            boolean ans = false;
            if(i>0 && nums[i]==nums[i-1]) ans |= dp3[(j-2) % 3];
            if(i>1 && nums[i]==nums[i-1] && nums[i-1]==nums[i-2]) ans |= dp3[(j-3) % 3];
            if(i>1 && nums[i]==nums[i-1]+1 && nums[i]==nums[i-2]+2) ans |= dp3[(j-3) % 3];
            dp3[j%3] = ans;
        }
        return dp3[n%3];
    }
}
