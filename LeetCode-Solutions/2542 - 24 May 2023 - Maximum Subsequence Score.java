/*
Runtime: 102 ms Beats 62.7%
Memory: 60.7 MB Beats 43.68%
*/

class Solution{
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] nums = new int[n][2];
        for(int i=0; i<n; i++) nums[i] = new int[] {nums2[i], nums1[i]};
        Arrays.sort(nums, (a,b) -> b[0]-a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a,b)->a-b);
        long ans=0, sum=0;
        for(int[] num: nums){
            pq.add(num[1]);
            sum += num[1];
            if(pq.size()>k) sum -= pq.poll();
            if(pq.size()==k) ans = Math.max(ans, sum*num[0]);
        }
        return ans;
    }
}
