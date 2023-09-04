/*
Runtime: 0 ms
Beats 100.00% of users with Java

Memory: 43.02 MB
Beats 94.51% of users with Java
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode tortoise = head;
        ListNode hare = head;
        while(hare.next!=null && hare.next.next!=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise==hare) return true;
        }
        return false;
    }
}
