/*
Runtime
4 ms Beats 99.50%
Memory
42.3 MB Beats 52.36%
*/

class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[] dp = new int[nums2.length+1];
        for(int i=1; i<=nums1.length; i++){
            int[] row = new int[nums2.length+1];
            for(int j=1; j<=nums2.length; j++){
                if(nums1[i-1] == nums2[j-1]) row[j] = dp[j-1]+1;
                else row[j] = Math.max(row[j-1], dp[j]); 
            }
            dp = row;
        }
        return dp[nums2.length];
    }
}
