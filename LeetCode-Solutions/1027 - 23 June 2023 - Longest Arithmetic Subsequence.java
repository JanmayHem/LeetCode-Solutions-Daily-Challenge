class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
        Map<Integer, Integer>[] map = new HashMap[n];
        int max=0;
        for(int i=0; i<n; i++){
            map[i] = new HashMap<>();
            for(int j=0; j<i; j++){
                int diff = nums[i]-nums[j];
                map[i].put(diff, map[j].getOrDefault(diff,0)+1);
                max = Math.max(max, map[i].get(diff));
            }
        }
        return max+1;
    }
}
