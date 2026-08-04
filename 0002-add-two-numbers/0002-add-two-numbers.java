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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int prev = sum / 10;
        sum = sum % 10;
        ListNode sumList = new ListNode(sum);
        ListNode header = sumList;
        l1 = l1.next;
        l2 = l2.next;
        while (Objects.nonNull(l1) && Objects.nonNull(l2)) {
            sum = l1.val + l2.val + prev;
            prev = sum / 10;
            sum = sum % 10;
            sumList.next = new ListNode(sum);
            sumList = sumList.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (Objects.nonNull(l1)) {
            sum = l1.val + prev;
            prev = sum / 10;
            sum = sum % 10;
            sumList.next = new ListNode(sum);
            sumList = sumList.next;
            l1 = l1.next;
        }
        while (Objects.nonNull(l2)) {
            sum = l2.val + prev;
            prev = sum / 10;
            sum = sum % 10;
            sumList.next = new ListNode(sum);
            sumList = sumList.next;
            l2 = l2.next;
        }
        if(prev>0){
            sumList.next = new ListNode(prev);
        }
        sumList = header;

        return sumList;
    }
}