class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode Odd = head;
        ListNode Even = head.next;
        ListNode EvenOnly = head.next;
        while(Odd.next!=null && Even.next!=null){
            Odd.next = Odd.next.next;
            Even.next = Even.next.next;
            Odd = Odd.next;
            Even = Even.next;
        }  
        Odd.next = EvenOnly;
        return head;
    }
}
