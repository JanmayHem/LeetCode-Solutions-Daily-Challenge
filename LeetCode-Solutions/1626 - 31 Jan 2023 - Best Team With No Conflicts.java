/*
Runtime:43 ms, faster than 79.59% of Java online submissions.
Memory Usage:42.5 MB, less than 64.63% of Java online submissions.
*/

class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int [][] joined = new int[scores.length][2];
        for(int i=0; i<scores.length; i++){
            joined[i][0] = scores[i];
            joined[i][1] = ages[i];
        }
        Arrays.sort(joined, (a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        int [] dp = new int[scores.length];
        int max = 0;
        for(int i=0; i<scores.length; i++){
            dp[i] = joined[i][0];
            for(int j=0; j<i; j++){
                if(joined[i][0] >= joined[j][0]){
                    dp[i] = Math.max(dp[i], dp[j]+joined[i][0]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
