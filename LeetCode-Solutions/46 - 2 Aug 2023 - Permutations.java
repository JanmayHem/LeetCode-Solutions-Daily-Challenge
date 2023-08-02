/*
Runtime: 1ms
Beats 98.58%of users with Java

Memory: 43.75mb
Beats 84.21%of users with Java
*/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums, ans);
        return ans;   
    }

    private void helper(int i, int[] nums, List<List<Integer>> ans){
        if(i>=nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int x: nums) temp.add(x);
            ans.add(temp);
            return;
        }

        for(int j=i; j<nums.length; j++){
            swap(nums, i, j);
            helper(i+1, nums, ans);
            swap(nums, j, i);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
}
