/*
Runtime: 20ms
Beats 94.33%of users with Java
*/

class Solution {
    public int findNumberOfLIS(int[] nums) {
        int l = nums.length;
        if(l==0) return 0;

        int dp[] = new int[l];
        Arrays.fill(dp,1);        
        
        int count[] = new int[l];
        Arrays.fill(count,1);
        
        int maxLen = 1;
        for(int i=0; i<l; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i] = dp[j]+1;
                        count[i] = count[j];
                    } 
                    else if(dp[j]+1 == dp[i]) count[i] += count[j];
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }    
        
        int ans=0;
        for(int i=0; i<l; i++) if(dp[i]==maxLen) ans+=count[i];     
        return ans;
    }
}
