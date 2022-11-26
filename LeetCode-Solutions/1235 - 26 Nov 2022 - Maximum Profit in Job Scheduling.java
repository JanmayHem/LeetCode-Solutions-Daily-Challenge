/*
Runtime: 33 ms, faster than 91.62% of Java online submissions for Maximum Profit in Job Scheduling.
Memory Usage: 75.9 MB, less than 34.35% of Java online submissions for Maximum Profit in Job Scheduling.
*/

class Solution {
    class Job{
        int s, e, p;
        Job(int s, int e, int p){
            this.s = s;
            this.e = e;
            this.p = p;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        Job []jobs = new Job[n];
        for(int i=0; i<n; i++){
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        
        Arrays.sort(jobs, (a,b) -> (a.e-b.e));
        
        int dp[] = new int[n];
        dp[0] = jobs[0].p;
        
        for(int i=1; i<n; i++){
            dp[i] = Math.max(dp[i-1], jobs[i].p);
            for(int j=i-1; j>=0; j--){
                if(jobs[j].e <= jobs[i].s){
                    dp[i] = Math.max(dp[i], jobs[i].p + dp[j]);
                    break;
                }
            }
        }
        return dp[n-1];
    }
}
