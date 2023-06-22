/*
Runtime: 4 ms Beats 99.3% 
*/

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy=Integer.MIN_VALUE, sell=0;
        for(int price: prices){
            buy = Math.max(buy, sell-price);
            sell = Math.max(sell, buy+price-fee);
        }
        return sell;
    }
}
