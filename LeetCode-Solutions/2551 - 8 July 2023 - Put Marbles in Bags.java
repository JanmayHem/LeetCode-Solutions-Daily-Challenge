/*
Runtime: 37 ms Beats 97.73%
Memory: 55.6 MB Beats 82.95%
*/

class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] costs = new int[n-1];
        for(int i=0; i<n-1; i++) costs[i] = weights[i]+weights[i+1];
        Arrays.sort(costs);
        long max=0, min=0;
        for(int i=0; i<k-1; i++){
            max += costs[costs.length-1-i];
            min += costs[i];
        }
        return max-min;
    }
}
