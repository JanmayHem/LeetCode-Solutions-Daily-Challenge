/*
Runtime: 1 ms Beats 90.22%
*/

class Solution {
    public int maxProfit(int[] prices) {
        int profitA=0, profitB=0;   
        for(int i=1; i<prices.length; i++){
            int copy=profitA;
            profitA=Math.max(profitA+prices[i]-prices[i-1], profitB);
            profitB=Math.max(copy, profitB);
        }
        return Math.max(profitA, profitB);
    }
}
