/*
Runtime: 5ms
Beats 97.29%of users with Java

Memory: 41.12mb 
Beats 63.41%of users with Java
*/

public class Solution {
    double[][][] dp;
    int[] xmove = {-2, -2, -1, -1, 1, 1, 2, 2};
    int[] ymove = {-1, 1, -2, 2, -2, 2, -1, 1};

    public double knightProbability(int n, int k, int row, int col) {
        dp = new double[n][n][k + 1];
        for(int i=0; i<n; i++) for(int j=0; j<n; j++) Arrays.fill(dp[i][j], -1.0);
        double fav = solve(row,col,n,k);
        double total = Math.pow(8,k);
        return fav/total;
    }

    private double solve(int row, int col, int n, int k) {
        if (row<0 || col<0 || row>=n || col>=n) return 0;
        if (k==0) return 1;
        if (dp[row][col][k] != -1.0) return dp[row][col][k];
        double ans=0;
        for (int i=0; i<8; i++) ans += solve(row+xmove[i], col+ymove[i], n, k-1);
        return dp[row][col][k] = ans;
    }
}
