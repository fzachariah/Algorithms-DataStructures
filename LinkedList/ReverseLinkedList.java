/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode temp=head;
        
        while(temp!=null)
        {
            ListNode tempLoop=temp.next;
            temp.next=prev;
            prev=temp;
            temp=tempLoop;
        }
        
        return prev;
        
    }
    
  
}