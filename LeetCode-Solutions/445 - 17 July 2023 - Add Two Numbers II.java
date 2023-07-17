class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1!=null){
            s1.push(l1.val);
            l1 = l1.next;        
        }
        while(l2!=null){
            s2.push(l2.val);
            l2 = l2.next;        
        }
        ListNode res = null;
        int c=0;
        while(!s1.isEmpty() || !s2.isEmpty()){
            int a=0, b=0;
            if(!s1.isEmpty()) a=s1.pop();
            if(!s2.isEmpty()) b=s2.pop();
            int sum = a+b+c;
            ListNode temp = new ListNode(sum%10);
            c=sum/10;
            if(res==null) res = temp;
            else{
                temp.next = res;
                res = temp;
            }
        }
        if(c>0){
            ListNode temp = new ListNode(c);
            temp.next = res;
            res = temp;
        }
        return res;
    }

}
