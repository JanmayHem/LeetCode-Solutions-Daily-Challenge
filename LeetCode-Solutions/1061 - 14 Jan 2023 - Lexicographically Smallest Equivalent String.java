/*
Runtime: 1 ms Beats 100%
Memory: 40.6 MB Beats 90.91%
*/

class Solution {
    private int[] arr;
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        arr = new int[26];
        for(int i=0; i<26; ++i) arr[i]=i;
        for(int i=0; i<s1.length(); ++i){
            int x=s1.charAt(i)-'a', y=s2.charAt(i)-'a';
            int findx = find(x), findy = find(y);
            if(findx < findy) arr[findy]=findx;
            else arr[findx] = findy;
        }
        StringBuilder sb =  new StringBuilder();
        for(char c:baseStr.toCharArray()){
            char res = (char) (find(c-'a')+'a');
            sb.append(res);
        }
        return sb.toString();
    }
    private int find(int n){
        if(arr[n] != n) arr[n] = find(arr[n]);
        return arr[n];
    }
}
