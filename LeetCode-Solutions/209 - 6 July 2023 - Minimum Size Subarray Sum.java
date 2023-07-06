/*
Runtime: 1 ms Beats 100%
Memory: 53.7 MB Beats 82.20%
*/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0, j=0, sum=0, ans=Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                sum-=nums[i];
                ans = Math.min(ans, j-i+1);
                i++;
            }
            j++;
        }
        return ans==Integer.MAX_VALUE? 0 : ans;
    }
}
