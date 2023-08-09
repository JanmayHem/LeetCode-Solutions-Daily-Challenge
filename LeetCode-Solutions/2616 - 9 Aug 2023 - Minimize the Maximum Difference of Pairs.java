/*
Runtime: 17 ms
Beats 95.00%of users with Java

Memory: 59.23 mb
Beats 51.25%of users with Java
*/

class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int l=-1, r=nums[n-1]-nums[0];
        while(l+1<r){
            int mid = (r+l)/2;
            if(check(nums, p, mid)) r = mid;
            else l = mid; 
        }
        return r;
    }

    private boolean check(int[] nums, int p, int mid){
        int n = nums.length;
        int count=0, i=0;
        while(i<n-1){
            if(nums[i+1]-nums[i]<=mid){
                count++;
                i+=2;
                continue;
            }
            i++;
        }
        return count>=p;
    }
}
