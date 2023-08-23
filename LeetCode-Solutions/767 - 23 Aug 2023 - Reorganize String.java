/*
Runtime: 4 ms
Beats 53.93%of users with Java
Memory: 40.60 MB
Beats 79.24%of users with Java
*/

class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        if(map.get(pq.peek())>(s.length()+1)/2) return "";
        StringBuilder ans = new StringBuilder();
        char[] res = new char[s.length()];
        int i=0;
        while(!pq.isEmpty()){
            char c = pq.poll();
            for(int j=0; j<map.get(c); j++){
                if(i >= s.length()) i=1;
                res[i] = c;
                i += 2;
            }
        }
        return new String(res);
    }
}
