/*
Runtime: 1 ms Beats 100%
Memory: 40.6 MB Beats 97.15%
*/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int lenA = a.length()-1, lenB = b.length()-1, carry = 0;
        while(lenA>=0 || lenB>=0){
            int s = carry;
            if(lenA>=0){
                s += a.charAt(lenA) - '0';
                lenA--;
            }
            if(lenB>=0){
                s += b.charAt(lenB) - '0';
                lenB--;
            }
            carry = s>1? 1:0;
            answer.append(s%2);
        }
        if(carry!=0) answer.append(carry);
        return answer.reverse().toString();
    }
}
