/*
Runtime: 2 ms, faster than 94.55% of Java online submissions for Unique Number of Occurrences.
Memory Usage: 40.5 MB, less than 85.49% of Java online submissions for Unique Number of Occurrences.
*/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : arr) 
            m.merge(i, 1, Integer::sum);
        Set<Integer> set = new HashSet<>(m.values());
        return m.size() == set.size();
    }
}
