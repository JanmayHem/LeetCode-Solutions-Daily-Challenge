class Solution {
    public int pairSum(ListNode head) {
        ListNode a = head, b = head;
        int sum = 0;
        while(b!=null && b.next!=null){
            a = a.next;
            b = b.next.next;
        }
        ListNode nextNode, prev = null;
        while (a != null) {
            nextNode = a.next;
            a.next = prev;
            prev = a;
            a = nextNode;
        }
        while (prev != null) {
            sum = Math.max(sum, head.val+prev.val);
            prev = prev.next;
            head = head.next;
        }
        return sum;
    }
}
