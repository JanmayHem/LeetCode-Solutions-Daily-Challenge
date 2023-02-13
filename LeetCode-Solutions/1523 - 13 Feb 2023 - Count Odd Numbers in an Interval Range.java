/*
Runtime: 0 ms Beats 100%
Memory: 38.9 MB Beats 90.58%
*/

class Solution {
    public int countOdds(int low, int high) {
        int odds=0;
        if(low%2!=0 || high%2!=0) odds++;
        odds += (high-low)/2;
        return odds;
    }
}
