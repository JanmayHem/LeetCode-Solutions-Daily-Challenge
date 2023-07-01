/*
Memory: 39.7 MB Beats 88.2%
*/

class Solution {
    int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        distribute(cookies, 0, k, new int[k]);
        return ans;
    }

    private void distribute(int[] cookies, int i, int k, int[] res) {
        if(i == cookies.length){
            int max=0;
            for(int j: res) max = Math.max(max, j);
            ans = Math.min(ans, max);
            return;
        }
        for(int j=0; j<k; j++){
            res[j] += cookies[i];
            distribute(cookies, i+1, k, res);
            res[j] -= cookies[i]; 
        }
    }
}
