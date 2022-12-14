/*
Runtime: 0 ms Beats 100%
Memory: 39.6 MB Beats 93.88%
*/

class Solution {
    public int rob(int[] nums) {
        int x=0, y=0;
        for(int i:nums)
            y = Math.max(i+x, x=y);
        return y;
    }
}
