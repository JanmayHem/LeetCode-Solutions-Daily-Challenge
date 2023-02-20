/*
Runtime: 0 ms Beats 100%
Memory: 41.5 MB Beats 97.57%
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length-1, mid;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=0;
        for(int i=0; i<nums.length; ++i) {
            if(nums[i] == target || nums[i]>target) return i;
            if(i == nums.length-1 && ans==0) ans = nums.length;
        }
        return ans;
    }
}
