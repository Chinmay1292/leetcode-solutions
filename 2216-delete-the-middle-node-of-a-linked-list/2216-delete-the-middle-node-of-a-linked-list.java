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
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        if(head.next==null) return null;
        if(curr.next.next==null){
            curr.next=null;
            return head;
        }
        if(curr.next!=null){
            ListNode slow = curr.next;
            ListNode fast = curr.next.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            slow.val = slow.next.val;
            slow.next = slow.next.next;
        }
        return head;
    }
}