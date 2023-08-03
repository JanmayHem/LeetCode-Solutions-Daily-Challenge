/*
Runtime: 1 ms
Beats 78.73%

Memory: 41.3 MB
Beats 64.44%
*/

class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        map.put("2", Arrays.asList("a", "b", "c"));
        map.put("3", Arrays.asList("d", "e", "f"));
        map.put("4", Arrays.asList("g", "h", "i"));
        map.put("5", Arrays.asList("j", "k", "l"));
        map.put("6", Arrays.asList("m", "n", "o"));
        map.put("7", Arrays.asList("p", "q", "r", "s"));
        map.put("8", Arrays.asList("t", "u", "v"));
        map.put("9", Arrays.asList("w", "x", "y", "z"));

        List<String> ans = new ArrayList<>();
        ans.add("");
        for(int i=0; i<digits.length(); i++){
            List<String> temp = new ArrayList<>();
            for(String s: ans) for(String c: map.get(digits.substring(i,i+1))) temp.add(s+c);
            ans = temp;
        }

        return ans;
    }
}
