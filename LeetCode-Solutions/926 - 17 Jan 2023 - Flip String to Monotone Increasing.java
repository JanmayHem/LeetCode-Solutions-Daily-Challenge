/*
Runtime: 9 ms Beats 92.20%
Memory: 42.3 MB Beats 100%
*/

class Solution {
    public int minFlipsMonoIncr(String s) {
        int ones=0, flips=0;
        for(int c=0; c<s.length(); c++){
            if(s.charAt(c)=='1') ones++;
            else flips = Math.min(ones, flips+1);
        }
        return flips;
    }
}
