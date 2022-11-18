/*
Runtime: 2 ms, faster than 80.60% of Java online submissions for Ugly Number.
*/

class Solution {
    public boolean isUgly(int n) {
        if(n==0)
            return false;
        else if(n==1)
            return true;
        else if(n%2==0)
            return isUgly(n/2);
        else if(n%3==0)
            return isUgly(n/3);
        else if(n%5==0)
            return isUgly(n/5);
        return false;
    }
}
