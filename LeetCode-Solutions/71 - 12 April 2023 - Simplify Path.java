/*
Runtime: 4 ms Beats 85.61%
Memory: 42.2 MB Beats 95.64%
*/

class Solution {
    public String simplifyPath(String path) {
        Deque<String> dq = new ArrayDeque<>();
        for(String s: path.split("/")){
            if(!dq.isEmpty() && s.equals("..")) dq.removeLast();
            else if(!s.equals(".") && !s.equals("") && !s.equals("..")) dq.addLast(s);
        }

        StringBuilder sb = new StringBuilder();
        for(String s: dq) sb.append("/").append(s);
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
