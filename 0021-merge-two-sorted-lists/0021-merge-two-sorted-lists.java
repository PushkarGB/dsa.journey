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
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode curr1 = list1 , curr2 =  list2;
        while(Objects.nonNull(curr1) && Objects.nonNull(curr2)){
            if(curr1.val<=curr2.val){
                ans.next = curr1;
                curr1 = curr1.next;
            }else{
                ans.next = curr2;
                curr2 = curr2.next;
            }
            ans = ans.next;
        }

         while(Objects.nonNull(curr2)){
            ans.next = curr2;
            curr2 = curr2.next;
            ans = ans.next;
         }
        while(Objects.nonNull(curr1)){
            ans.next = curr1;
            curr1 = curr1.next;
            ans = ans.next;
         }

         return dummy.next;
    }
}