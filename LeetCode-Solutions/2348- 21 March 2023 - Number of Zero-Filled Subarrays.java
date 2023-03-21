/*
Runtime: 3 ms Beats 99.69%
Memory: 59.7 MB Beats 72.41%
*/

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ct=0;
        for(int i=0, j=0; i<nums.length; i++){
            if(nums[i] != 0) j = i+1;
            ct += i-j+1;
        }
        return ct;
    }
}
