/*
Runtime: 11 ms
Beats 100%

Memory: 43.3 MB
Beats 84.38%
*/

class Solution{
    public int strangePrinter(String s){
        int n = s.length();
        char[] ch = s.toCharArray();
        int[][] dp = new int[n][n];
        for(int[] row: dp) Arrays.fill(row, -1);
        return counter(0, n-1, ch, dp);
    } 

    private int counter(int start, int end, char[] ch, int[][] dp){
        if(start > end) return 0;
        if(dp[start][end] != -1) return dp[start][end];
        int startLetter = ch[start];
        int ans = 1 + counter(start+1, end, ch, dp);
        for(int i=start+1; i<=end; i++){
            if(ch[i] == startLetter){
                int ansOptimized = counter(start, i-1, ch, dp) + counter(i+1, end, ch, dp);
                ans = Math.min(ans, ansOptimized);
            } 
        }
        return dp[start][end] = ans;
    }
}
