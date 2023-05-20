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
        ListNode l3 = new  ListNode(0);
        ListNode head = l3;
        int carry = 0;
        while(l1 != null || l2 != null)
        {
            int l1_val = (l1 != null) ? l1.val :0;
            int l2_val = (l2 != null) ? l2.val :0;
            int value = l1_val + l2_val + carry; 
            carry = value/10;
            int last_dg = value%10;
            ListNode new_node = new ListNode(last_dg);
            l3.next = new_node;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
       
        if(carry>0)
        {
            l3.next = new ListNode(carry);
        }
        return head.next;
    }
}