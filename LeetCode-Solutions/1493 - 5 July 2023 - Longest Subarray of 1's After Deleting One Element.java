/*
Memory: 51.6 MB Beats 83.83%
*/

class Solution {
    public int longestSubarray(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        int ones=0;
        for(int i=0; i<nums.length; i++) {
            numsList.add(nums[i]);
            if(nums[i]==1) ones++;
        }
        if(ones==0) return 0;
        int currMax=0, ans=0;
        for(int i=0; i<numsList.size(); i++){
            if(numsList.get(i)==0){
                List<Integer> copy = new ArrayList<Integer>(numsList);
                copy.remove(i);
                currMax = countOnes(copy);
            }
            ans = Math.max(currMax, ans);
        }
        if(ans==0) return nums.length-1;
        return ans;
    }

    private int countOnes(List<Integer> numsList){
        int max=0, ct=0;
        for(int i=0; i<numsList.size(); i++){
            if(numsList.get(i) == 1) ct++;
            else ct = 0;
            max = Math.max(max, ct);
        }
        return max;
    }
}
