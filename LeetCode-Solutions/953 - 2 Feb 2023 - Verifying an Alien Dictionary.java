/*
	Runtime: 0 ms, faster than 100.00% of Java online submissions.
	Memory Usage: 40.6 MB, less than 95.95% of Java online submissions.
*/

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) orderMap[order.charAt(i) - 'a'] = i;
        for (int i = 0; i < words.length - 1; i++) if (!isSorted(words[i], words[i + 1], orderMap)) return false;
        return true;
    }

    private boolean isSorted(String word1, String word2, int[] orderMap) {
        int len = Math.min(word1.length(), word2.length());
        for (int i = 0; i < len; i++) if (word1.charAt(i) != word2.charAt(i)) return orderMap[word1.charAt(i) - 'a'] < orderMap[word2.charAt(i) - 'a'];
        return word1.length() <= word2.length();
    }
}
