/*
Runtime: 0 ms Beats 100%
Memory: 41.9 MB Beats 98.38%
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0; i<n; i++){
            ans[j] = nums[i];
            j+=2;
        }
        j=1;
        for(int i=n; i<2*n; i++){
            ans[j] = nums[i];
            j+=2;
        }
        return ans;
    }
}
