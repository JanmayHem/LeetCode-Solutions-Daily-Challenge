/*
Runtime: 7 ms Beats 100%
Memory: 41.6 MB Beats 70.80%
*/

class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high+1];
        dp[0]=1;
        int res = 0;
        for(int i=1; i<=high; i++){
            dp[i] = ((i-zero>=0 ? dp[i-zero] : 0) + (i-one>=0 ? dp[i-one] : 0))%1000000007;
            if(i >= low) res = (res+dp[i])%1000000007;
        }
        return res;
    }
}
