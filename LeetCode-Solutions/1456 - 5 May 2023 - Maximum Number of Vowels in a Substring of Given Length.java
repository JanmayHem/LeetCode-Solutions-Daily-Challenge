class Solution {
    public int maxVowels(String s, int k) {
        int ans=0, vowel=0;
        for(int i=0; i<s.length(); i++){
            vowel += isVowel(s.charAt(i));
            if(i>=k) vowel -= isVowel(s.charAt(i-k));
            ans = Math.max(ans, vowel); 
        } 
        return ans;
    }

    private int isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return 1;
        return 0;
    }
}
