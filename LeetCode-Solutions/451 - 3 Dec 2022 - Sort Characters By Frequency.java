class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            int max = 0;
            char maxChar = ' ';
            for (char c : map.keySet()) {
                if (map.get(c) > max && !set.contains(c)) {
                    max = map.get(c);
                    maxChar = c;
                }
            }
            for (int i = 0; i < max; i++) {
                sb.append(maxChar);
            }
            set.add(maxChar);
        }
        return sb.toString();
    }
}
