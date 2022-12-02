/*
Runtime:48 ms, faster than 44.44% of Java online submissions.
Usage:43.3 MB, less than 81.78% of Java online submissions.
*/

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int arr1[] = new int[26], arr2[] = new int[26];
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < word1.length(); i++) {
            arr1[word1.charAt(i) - 'a']++;
            set.add(word1.charAt(i));
        }
        for (int i = 0; i < word2.length(); i++) {
            arr2[word2.charAt(i) - 'a']++;
            set.remove(word2.charAt(i));
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.toString(arr1).equals(Arrays.toString(arr2)) && set.size()==0;
    }
}
