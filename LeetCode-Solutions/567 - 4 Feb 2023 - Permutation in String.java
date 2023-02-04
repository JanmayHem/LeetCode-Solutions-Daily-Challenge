/*
Runtime: 3 ms Beats 99.34%
Memory: 42.2 MB Beats 79.12%
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1=s1.length(), len2=s2.length();
        if(len1>len2) return false;
        int[] arr = new int[26];
        for(int i=0; i<len1; i++) arr[s1.charAt(i)-'a']++;
        for(int i=0; i<len2; i++){
            arr[s2.charAt(i)-'a']--;
            if(i-len1 >= 0) arr[s2.charAt(i-len1)-'a']++;
            if(check(arr)) return true;
        }
        return false;
    }

    public boolean check(int[] array){
       for(int i=0; i<26; i++) if(array[i] != 0) return false;
       return true;
    }
}
