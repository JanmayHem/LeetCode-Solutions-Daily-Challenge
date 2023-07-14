class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans=0;
        for(int i: arr){
            int c = i;
            map.put(c, map.getOrDefault(c-difference, 0)+1);
            ans = Math.max(ans, map.get(c)); 
        }
        return ans;
    }
}
