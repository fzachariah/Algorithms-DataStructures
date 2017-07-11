/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null ||k==0 || head.next==null)
        {
            return head;
        }
        
        int length=0;
        ListNode temp=head;
        ListNode tempOne=head;
        ListNode end=null;
        while(temp!=null)
        {
            if(temp.next==null)
            {
                end=temp;
            }
            temp=temp.next;
            length++;
        }
        k=k%length;
        
        if(k==0)
        {
            return head;
        }
        
        int rem=length-k;
        ListNode prev=null;
        while(rem>0)
        {
            prev=tempOne;
            tempOne=tempOne.next;
            rem--;
        }
        
        
        
        end.next=head;
        prev.next=null;
        
        
        

        return tempOne;
        
    }
}