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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        //1 -> find the second half use two pointers fast and slow use tortoise and hare method
        //2 -> reverse the second half  by passing slow.next as head 
        //3 -> compare the first half and second half elements

        ListNode slow = head,fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newNode = reverseList(slow.next); 
        ListNode first = head,second = newNode;

        while(second != null) {
            if(first.val != second.val) {
                //not a palindrome
                reverseList(newNode);
                return false;
            }

            second = second.next;
            first = first.next;
        }

        //palindrome the second pointer gets exhausted
        reverseList(newNode);
        return true;
    }

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