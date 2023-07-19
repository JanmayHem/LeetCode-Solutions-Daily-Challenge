/*
Runtime: 67 ms Beats 94.6%
Memory: 96.6 MB Beats 74.1%
*/

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans=0, n=intervals.length;
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int end = intervals[0][1];
        for(int i=1; i<n; i++){
            if(intervals[i][0]<end){
                ans++;
                end = Math.min(end, intervals[i][1]);
            }
            else end = intervals[i][1];
        }
        return ans;
    }
}
