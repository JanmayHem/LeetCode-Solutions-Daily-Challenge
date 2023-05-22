/*
Runtime: 12 ms Beats 86.73%
Memory: 45 MB Beats 90.64%
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums) map.put(n, map.getOrDefault(n,0) + 1);
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1]));
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            q.add(new int[]{e.getKey(), e.getValue()});
            while (q.size() > k) q.poll();
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = q.poll()[0];
        return result;
    }
}
