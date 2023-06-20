class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int total = 2*k+1;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        if(n<total) return res;
        long[] Sum = new long[n+1];
        for (int i=0; i<n; ++i) Sum[i+1] = Sum[i]+nums[i];
        for (int i=k; i+k<n; ++i) res[i] = (int) ((Sum[i+k+1]-Sum[i-k])/total);
        return res;
    }
}
