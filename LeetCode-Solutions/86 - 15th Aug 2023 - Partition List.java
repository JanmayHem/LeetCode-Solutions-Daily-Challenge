/*
Runtime: 0 ms
Beats 100.00% of users with Java

Memory: 41.06 mb
Beats 49.07% of users with Java
*/

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode prev = new ListNode(0);
        ListNode prevCurr = prev;
        ListNode next = new ListNode(0);
        ListNode nextCurr = next;
        while(head != null){
            if(head.val < x){
                prevCurr.next = head;
                prevCurr = prevCurr.next; 
            }
            else{
                nextCurr.next = head;
                nextCurr = nextCurr.next; 
            }
            head = head.next;
        }

        nextCurr.next = null;
        prevCurr.next = next.next;

        return prev.next; 
    }
}
