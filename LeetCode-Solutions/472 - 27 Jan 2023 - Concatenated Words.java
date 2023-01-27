class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> s = new HashSet<>();
        List<String> result = new ArrayList<>();
        for(String i: words) s.add(i);
        for(String i: words) {
            if(check(i,s)) result.add(i);
        }
        return concatenateWords;
    }

    public boolean check(String word, Set<String> s) {
        for(int i = 1; i < word.length(); i++) {
            String pre = word.substring(0, i);
            String suf = word.substring(i, word.length());
            if(s.contains(pre) && (s.contains(suf) || check(suf, s))) return true;
        }
        return false;
    }
}
