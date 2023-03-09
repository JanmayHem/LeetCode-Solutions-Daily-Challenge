/*
Runtime: 0 ms Beats 100%
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode l1 = head, l2 = head;
        while(l2 != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next.next;
            if(l1==l2) break;
        }
        if(l2 == null || l2.next == null)
            return null;
        
        while(head != l1){
            head = head.next;
            l1 = l1.next;
        }
        return head;
    }
}
