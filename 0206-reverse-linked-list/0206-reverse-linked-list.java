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
        //using three pointer approach prev current and next

        ListNode prev = null, curr = head,next;

        while(curr!=null) {
            //update the next before updating the next of current
            next = curr.next;
            curr.next = prev; //reversing the link
            //update the prev and curr
            prev = curr;
            curr = next;
        }
        return prev;
    }
}