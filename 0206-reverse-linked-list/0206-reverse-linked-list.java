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
    public ListNode reverseList(ListNode head) {
        if(Objects.isNull(head) || Objects.isNull(head.next)) return head;
        Deque<ListNode> stack = new ArrayDeque<>();    
        ListNode curr = head;
     
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }
        head = stack.pop();
        curr = head;
        while(!stack.isEmpty()){
            curr.next = stack.pop();
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}