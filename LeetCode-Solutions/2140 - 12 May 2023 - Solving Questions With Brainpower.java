/*
Runtime: 6 ms Beats 88.36%
Memory: 95 MB Beats 79.37%
*/

class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dpArr = new long[n+1];
        for(int i=n-1; i>=0; i--){
            int currPoints = questions[i][0];
            int currBrainpower = questions[i][1];
            int next = Math.min(currBrainpower+i+1, n);
            long points = currPoints + dpArr[next];
            dpArr[i] = Math.max(points, dpArr[i+1]);
        }
        return dpArr[0];
    }
}
