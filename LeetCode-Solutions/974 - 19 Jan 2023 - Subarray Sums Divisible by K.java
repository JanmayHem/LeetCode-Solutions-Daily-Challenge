/*
Runtime: 4 ms Beats 92.83%
Memory: 46.1 MB Beats 89.76%
*/

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int modPrefix=0, ans=0;
        int[] prefixArray = new int[k];
        prefixArray[0]=1;
        for(int i: nums){
            modPrefix = (modPrefix + i % k + k) % k;
            ans += prefixArray[modPrefix];
            prefixArray[modPrefix]++;
        }
        return ans;
    }
}
