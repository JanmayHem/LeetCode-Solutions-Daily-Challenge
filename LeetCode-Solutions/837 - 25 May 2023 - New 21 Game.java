class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if(k==0 || n>=k-1+maxPts) return 1.0;
        double[] dp = new double[n+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        double prob=0.0, wSum=1.0;
        for(int i=1; i<n+1; i++){
            dp[i] = wSum/maxPts;
            if(i<k) wSum += dp[i];
            else prob += dp[i];
            if(i>=maxPts) wSum -= dp[i-maxPts];
        } 
        return prob;
    }
}
