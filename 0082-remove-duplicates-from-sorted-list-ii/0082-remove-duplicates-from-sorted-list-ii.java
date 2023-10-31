/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode duplicate;
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        } 
        if (duplicate != null) {
            if (head.val == duplicate.val) {
                return deleteDuplicates(head.next);
            } else {
                duplicate = null;
                head = deleteDuplicates(head);
            }
        } else if (head.next != null && head.val == head.next.val) {
            duplicate = head;
            return deleteDuplicates(head.next.next);
        } else {
            duplicate = null;
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }

}