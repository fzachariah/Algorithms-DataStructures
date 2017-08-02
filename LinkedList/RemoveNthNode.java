/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode first=head;
        ListNode second=head;
        
        int count=0;
        
        while(count<n)
        {
            first=first.next;
            count++;
        }
        
        ListNode prev=null;
        
        while(first!=null)
        {
            first=first.next;
            prev=second;
            second=second.next;
        }
        
        if(prev!=null)
        {
        prev.next=second.next;
        }
        else
        {
            head=second.next;
        }
        
        return head;
        
    }
}