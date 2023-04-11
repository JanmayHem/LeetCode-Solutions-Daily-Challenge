class Solution {
    public String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            String c = s.substring(i, i+1);
            if(c.equals("*")){
                if(!stack.isEmpty()) stack.pop();
            }
            else stack.push(c);
        }
        return String.join("", stack);
    }
}
