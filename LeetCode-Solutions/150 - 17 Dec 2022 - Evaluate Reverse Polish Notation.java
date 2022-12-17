/*
Runtime: 6 ms Beats 89.26%
Memory: 42.2 MB Beats 81.94%
*/

class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "/", "*"));
        Stack<Integer> RPN = new Stack<>();  
        for(String i: tokens){
            if(!operators.contains(i)){
                RPN.push(Integer.valueOf(i));
                continue;
            }
            int y = RPN.pop();
            int x = RPN.pop();
            if("+".equals(i)) RPN.push(x+y);
            else if("-".equals(i)) RPN.push(x-y);
            else if("*".equals(i)) RPN.push(x*y);
            else if("/".equals(i)) RPN.push(x/y);
        }
        return RPN.peek();
    }
}
