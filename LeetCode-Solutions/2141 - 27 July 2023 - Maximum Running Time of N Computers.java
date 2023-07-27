/*
Runtime: 15 ms
Beats 98.18%of users with Java

Memory: 57.02 mb
Beats 58.18%of users with Java
*/

class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long l=1, r=0;
        for(long b: batteries) r += b;
        r /= n;
        while(l<r){
            long mid = (l+r+1)/2;
            if(isPossible(batteries, n, mid)) l = mid;
            else r = mid-1;
        }
        return l;
    }

    private boolean isPossible(int[] batteries, int n, long mid){
        long s=0;
        for(int battery: batteries) s += Math.min(battery, mid);
        return s >= mid*n;
    }
}
