/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
*/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] arr = new ListNode[100];
        int i = 0;
        while(head != null){
            arr[i++] = head;
            head = head.next;
        }
        return arr[i/2];
    }
}
