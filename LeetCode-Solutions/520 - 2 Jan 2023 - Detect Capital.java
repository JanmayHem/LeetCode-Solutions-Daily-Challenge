/*
Runtime: 1 ms Beats 100%
Memory: 40.3 MB Beats 97.51%
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        int capital=0, small=0;
        boolean first=false;
        if(Character.isUpperCase(word.charAt(0))) first=true;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))) capital++;
            else small++;
        }
        boolean ans=false;
        if(capital==1 || capital==word.length() || small==word.length()) ans=true;
        if(!first && capital==1) ans=false;
        return ans;
    }
}
