/*
Runtime: 0 ms
Beats 100.00%of users with Java

Memory: 39.90 mb
Beats 66.81%of users with Java
*/

class Solution {
    int[][] dp;
    
    private int score(int[] nums, int l, int r) {
        if (dp[l][r] != -1) return dp[l][r];
        if (l == r) return nums[l];        
        int left = nums[l] - score(nums, l + 1, r);
        int right = nums[r] - score(nums, l, r - 1);
        dp[l][r] = Math.max(left, right);
        return dp[l][r];
    }
    
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];
        for (int i = 0; i < n; ++i) Arrays.fill(dp[i], -1);
        return score(nums, 0, n - 1) >= 0;
    }
}
