/*
Runtime: 570 ms Beats 78.4%
Memory: 57.4 MB Beats 80%
*/

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int pile : piles)
            pq.offer(pile);
        while (k-- > 0) {
            int pile = pq.poll();
            pq.offer(pile - pile / 2);
        }
        int sum = 0;
        while (!pq.isEmpty()) 
            sum += pq.poll();
        return sum;
    }
}
