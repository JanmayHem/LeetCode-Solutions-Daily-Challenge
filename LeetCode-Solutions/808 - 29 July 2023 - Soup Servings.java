/*
Runtime 1 ms
Beats 88.33%
*/

class Solution{
    public double siupServing(int n){
        return n >= 4800? 1.0 : serve((n+24)/25, (n+24)/25);
    }

    private double[][] memo = new double[4800/25][4800/25];

    private double serve(int A, int B){
        if(A<=0 && B<=0) return 0.5;
        if(A<=0) return 1.0;
        if(B<=0) return 0.0;
        if(memo[A][B]>0) return memo[A][B];
        return memo[A][B] = 0.25*(serve(A-4,B) + serve(A-3,B-1) + serve(A-2,B-2) + serve(A-1,B-3));
    }
}
