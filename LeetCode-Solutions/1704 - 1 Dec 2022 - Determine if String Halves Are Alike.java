/*
Runtime: 5 ms, faster than 78.43% of Java online submissions for Determine if String Halves Are Alike.
Memory Usage: 40.4 MB, less than 95.23% of Java online submissions for Determine if String Halves Are Alike.
*/

class Solution {
    public boolean halvesAreAlike(String s) {
        int ct1=0, ct2=0;
        s = s.toLowerCase();
        int count = 0;
        String vow ="aeiou";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<vow.length();i++)
            vowels.add(vow.charAt(i));

        for(int i=0; i<s.length(); i++){
            if(vowels.contains(s.charAt(i))) {
                if (i < s.length() / 2)
                    ct1++;
                else
                    ct2++;
            }
        }
        return ct1==ct2;
    }
}
