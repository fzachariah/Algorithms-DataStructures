// Given a linked list, determine if it has a cycle in it.

// Follow up:
// Can you solve it without using extra space?




/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    
    public boolean hasCycle(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return false;
        }
        
        ListNode first=head;
        ListNode second=head;
    
        while(second.next!=null && second.next.next!=null)
        {
            first=first.next;
            second=second.next.next;
            if(first==second)
            {
                return true;
            }
        }
        
        
        return false;
    }
}