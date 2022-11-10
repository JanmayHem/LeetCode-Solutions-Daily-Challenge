// Faster solution
class Solution {
    public String removeDuplicates(String s) {
        int i = 0;
        int len = s.length();

        char arr[] = s.toCharArray();
        for(int j = 0; j<len; j++){
            arr[i] = arr[j];
            if(i>0 && arr[i]==arr[i-1])
                i -= 2;
            i++;
        }
        return new String(arr, 0, i);
    }
}

// Another way, using stack
class Solution {
    public String removeDuplicates(String s) {
        Stack<String> stack = new Stack<String>();
        for(int i:s){
            if(stack.empty())
                stack.push(s(i));
            if(stack.top() == s(i))
                stack.pop();
            
            return stack;
        }
    }
}
