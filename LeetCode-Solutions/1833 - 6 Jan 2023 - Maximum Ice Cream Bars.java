class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int total=0, bars=0;
        for(int i:costs){
            total+=i;
            if(total>coins) break;
            bars++;
        }
        return bars;
    }
}
