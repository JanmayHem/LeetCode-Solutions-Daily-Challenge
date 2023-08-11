/*
Runtime: 2ms
Beats 100.00%of users with Java

Memory: 39.85 mb
Beats 93.89%of users with Java
*/

class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int i=0; i<coins.length; i++){
            for(int j=coins[i]; j<=amount; j++){
                dp[j] += dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
