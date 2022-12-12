/*
Runtime 0 ms Beats 100%
Memory 39 MB Beats 89%
*/

class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int fibo[] = new int[n+1];
        fibo[0]=0; fibo[1]=1; fibo[2]=2;
        for(int i=3;i<fibo.length;i++)
            fibo[i] = fibo[i-1] + fibo[i-2]; 
        return fibo[n];
    }
}
