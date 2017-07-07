
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.





/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp=head;
        ListNode prev=null;
        
        if(temp==null)
        {
            return null;
        }
        
        while(temp!=null)
        {
            if(prev!=null)
            {
               if(prev.val==temp.val)
               {
                   prev.next=temp.next;
               }
                else
                {
                    prev=temp;
                }
            }
            else
            {
                prev=temp;
            }
            
            temp=temp.next;
        }
        
        return head;
        
    }
}