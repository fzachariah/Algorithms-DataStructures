Sort a linked list in O(n log n) time using constant space complexity.



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head==null ||head.next==null)
        {
            return head;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
    
        return merge(l1, l2);
        
    }
    
    public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode start=null;
        ListNode curr=null;
        while(l1!=null && l2!=null)
        {
            if(start==null)
            {
                if(l1.val<l2.val)
                {
                    start=l1;
                    curr=l1;
                    l1=l1.next;
                }
                else
                {
                    start=l2;
                    curr=l2;
                    l2=l2.next;
                }
            }
            else
            {
                if(l1.val<l2.val)
                {
                    curr.next=l1;
                    l1=l1.next;
                    curr=curr.next;
                }
                else
                {
                    curr.next=l2;
                    l2=l2.next;
                    curr=curr.next;
                }
            }
        }
        
        if(l1!=null)
        {
            curr.next=l1;
            l1=l1.next;
            curr=curr.next;
        }
        
        if(l2!=null)
        {
            curr.next=l2;
            l2=l2.next;
            curr=curr.next;
        }
        return start;
    }
    
    
    
    
}
