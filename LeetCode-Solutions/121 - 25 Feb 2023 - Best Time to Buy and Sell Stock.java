class Solution {
    public int maxProfit(int[] prices) {
        int smallest = Integer.MAX_VALUE;
        int res = 0;
        for(int i: prices){
            smallest = Math.min(i,smallest);
            res = Math.max(res,i-smallest);
        }
        return res;
    }
}
