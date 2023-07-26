/*
Runtime: 201 ms
Beats 68.86%of users with Java

Memory: 59.00 mb
Beats 68.17%of users with Java
*/

class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1, r=(int)1e7, speed=-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(dist, hour, mid)){
                speed = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        return speed;
    }

    private boolean isPossible(int[] dist, double hour, int mid){
        double totalTime=0, time=0;
        for(int i: dist){
            time = (double)i/mid;
            totalTime += Math.ceil(time);
        }
        return totalTime-Math.ceil(time)+time <= hour;   
    }
}
