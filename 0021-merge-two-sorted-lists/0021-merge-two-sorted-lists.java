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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode tail = new ListNode(0, null);
        ListNode dummy = new ListNode(0, tail);
        while (Objects.nonNull(curr1) && Objects.nonNull(curr2)) {
            if (curr1.val <= curr2.val) {
                tail.next = curr1;
                curr1 = curr1.next;
            } else {
                tail.next = curr2;
                curr2 = curr2.next;
            }
            tail = tail.next;
        }
        while (Objects.nonNull(curr1)) {
            tail.next = curr1;
            curr1 = curr1.next;
            tail = tail.next;
        }
        while (Objects.nonNull(curr2)) {
            tail.next = curr2;
            curr2 = curr2.next;
            tail = tail.next;
        }
        return dummy.next.next;
    }
}