/*
Runtime: 0ms
Beats 100.00% of users with Java

Memory: 40.22MB
Beats 64.97% of users with Java
*/

class MyStack {
    private Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
        for(int i=1; i<q.size(); i++) q.add(q.remove());
    }
    public int pop() {
        return q.remove();
    }
    public int top() {
        return q.peek();
    }
    public boolean empty() {
        return q.isEmpty();
    }
}
