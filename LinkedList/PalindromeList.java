/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return true;
        }
        
        if(head.next.next==null)
        {
            if(head.val==head.next.val)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
         if (fast != null) {
             slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        
        while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
        }
        return true;
        
        
        
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
         while (head != null) {
         ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
    }
    return prev;
        
    }
}