/*
Runtime: 7 ms Beats 79.58%
Memory: 42.9 MB Beats 85.15%
*/

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int []answer = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int sum = 0;
            for(int j=0; j<nums.length; ++j){
                sum += nums[j];
                if(sum>queries[i]){
                    answer[i] = j;
                    break;
                }
                if(j == nums.length-1 && sum<=queries[i])
                    answer[i] = j+1;
            }
        }
        return answer;
    }
}
