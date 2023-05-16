/*
Runtime: 0 ms Beats 100%
Memory: 40.5 MB Beats 44.86%
*/

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = dummy;
        
        while(curr.next != null && curr.next.next != null){
            ListNode a = curr.next;
            ListNode b = curr.next.next;
            a.next = b.next;
            curr.next = b;
            curr.next.next = a;
            curr = curr.next.next;
        }
        return dummy.next;
    }
}
