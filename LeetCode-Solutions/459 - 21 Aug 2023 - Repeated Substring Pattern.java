/*
Runtime: 2ms
Beats 100.00%of users with Java

Memory: 43.96 MB
Beats 83.73%of users with Java
*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=n/2; i>0; i--){
            if(n%i==0 && s.charAt(i-1)==s.charAt(n-1)){
                int repeat = n/i;
                String ss = s.substring(0,i);
                if(ss.repeat(repeat).equals(s)) return true; 
            }
        }
        return false;
    }
}
