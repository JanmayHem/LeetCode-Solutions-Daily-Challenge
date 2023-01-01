/*
Runtime: 1 ms Beats 95.36%
Memory: 39.9 MB Beats 97.83%
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length()) return false;
        Map<Character, String> check = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char x = pattern.charAt(i);
            boolean cont = check.containsKey(x);
            if(check.containsValue(str[i]) && !cont) return false;
            if(cont && !check.get(x).equals(str[i])) return false;
            else check.put(pattern.charAt(i), str[i]);
        }
        return true;
    }
}
