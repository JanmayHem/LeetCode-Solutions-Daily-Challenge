/*
Runtime: 0ms
Beats 100.00%of users with Java

Memory: 41.10mb
Beats 29.42%of users with Java
*/

class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long absN = Math.abs((long) n);
        while (absN > 0) {
            if ((absN&1) == 1) ans *= x;
            absN >>= 1;
            x *= x;
        }
        return n<0? 1/ans:ans;
    }
}
