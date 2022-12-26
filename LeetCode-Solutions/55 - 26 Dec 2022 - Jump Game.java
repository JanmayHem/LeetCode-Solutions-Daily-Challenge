/*
Runtime: 2 ms Beats 92.42%
Memory: 42.6 MB Beats 96.22%
*/

class Solution {
    public boolean canJump(int[] nums) {
        int x=0;
        for(int i=0; i<nums.length; ++i){
            if(i>x) return false;
            x=Math.max(x, i+nums[i]);
        }
        return true;
    }
}
