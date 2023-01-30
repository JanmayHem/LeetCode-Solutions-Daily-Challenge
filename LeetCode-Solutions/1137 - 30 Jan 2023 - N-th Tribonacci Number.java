/*
Runtime: 0 ms Beats 100%
Memory: 39 MB Beats 80.79%
*/

class Solution {
    public int tribonacci(int n) {
        int t0=0, t1=1, t2=1, t=0;
        if(n==0) return t0;
        if(n==1) return t1;
        if(n==2) return t2;
        for(int i=2; i<n; i++){
            t=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=t;
        }
        return t;
    }
}
