/*
Runtime: 9 ms
Beats 92.61%

Memory: 41.7 MB
Beats 99.93%
*/

class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs.length==1) return 1;
        Arrays.sort(pairs, (a,b)->a[1]-b[1]);
        int curr = Integer.MIN_VALUE, ans = 0;
        for(int[] pair: pairs){
            if(curr<pair[0]){
                curr = pair[1];
                ans++;
            }
        }
        return ans;
    }
}
