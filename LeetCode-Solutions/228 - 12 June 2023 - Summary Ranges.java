/*
Runtime: 6 ms Beats 33.52%
Memory: 40.9 MB Beats 73.61%
*/

class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        List<String> ans = new ArrayList<>();
        if(n==0) return ans;

        arr[0][0] = nums[0];
        int curr=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]+1) arr[curr][1] = nums[i];
            else{
                curr++;
                arr[curr][0] = nums[i];
            }
        }

        for(int[] x: arr){
            if(x[1]==0) ans.add(Integer.toString(x[0]));
            else ans.add(Integer.toString(x[0]) + "->" + Integer.toString(x[1]));
            if(x[0]==nums[n-1] || x[1]==nums[n-1]) break;
        }
        return ans;
    }
}
