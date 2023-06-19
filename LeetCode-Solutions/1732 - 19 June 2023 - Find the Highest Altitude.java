/*
Runtime: 0 ms Beats 100%
Memory: 40.1 MB Beats 82.89%
*/

class Solution {
    public int largestAltitude(int[] gain) {
        int curr=0, max=0;
        for(int i=0; i<gain.length; i++){
            curr+=gain[i];
            if(curr>max) max = curr;
        }
        return max;
    }
}
