class Solution {
    public int maximumDetonation(int[][] bombs) {
        Map<Integer, List<Integer>> detonate = new HashMap<>();
        for (int i=0; i<bombs.length; i++) {
            for (int j=0; j<bombs.length; j++) {
                if(i == j) continue;
                if(Math.pow(bombs[i][2], 2) >= Math.pow(bombs[i][0]-bombs[j][0],2)+Math.pow(bombs[i][1]-bombs[j][1],2)) {
                    List<Integer> inRange = detonate.getOrDefault(i, new ArrayList<>());
                    inRange.add(j);
                    detonate.put(i, inRange);
                }
            }
        }
        int max = 0;
        for (int i=0; i<bombs.length; i++) {
            Set<Integer> extendedRange = new HashSet<>();
            extendedRange.add(i);
            findRange(i, extendedRange, detonate);
            max = Math.max(max, extendedRange.size());
        }
        return max;
    }

    private void findRange(int curr, Set<Integer> extendedRange, Map<Integer, List<Integer>> detonate) {
        List<Integer> inRange = detonate.getOrDefault(curr, new ArrayList<>());
        for(int range: inRange) {
            if(!extendedRange.contains(range)) {
                extendedRange.add(range);
                findRange(range, extendedRange, detonate);
            }
        }
    }
}
