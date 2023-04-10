/*
Runtime: 0 ms Beats 100%
*/

class Solution {
    public boolean isValid(String s) {
        int i = -1;
        char[] arr_stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') arr_stack[++i] = ch;
            else {
                if(i>=0 && ((arr_stack[i]=='(' && ch==')') || (arr_stack[i]=='{' && ch=='}') || (arr_stack[i]=='[' && ch==']'))) i--;
                else return false;
            }
        }
        return i == -1;
    }
}
