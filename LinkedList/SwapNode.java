/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return head;
        }
        
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        
        int count=0;
        
        while(count<2 && current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        
        if(next!=null)
        {
            head.next=swapPairs(next);
        }
        
        return prev;
       
        
    }
}