/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_h = new ListNode(0);
        ListNode p = l1,q = l2,current = dummy_h;
        int carry = 0;
        while(p!=null || q != null)
        {
            int a = (p != null) ? p.val : 0;
            int b = (q != null) ? q.val : 0;
            int sum = carry+a+b;
            carry = sum /10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if (p!=null) p = p.next;
            if (q!=null) q = q.next;
        }
        if(carry >0)
        {
            current.next = new ListNode(carry);
        }
        return dummy_h.next;
    }
}