/*
Runtime: 0 ms Beats 100%
Memory: 40.2 MB Beats 83.10%
*/

class MyQueue {

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public void push(int x) {
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        return stack2.pop();
    }
    
    public int peek() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
