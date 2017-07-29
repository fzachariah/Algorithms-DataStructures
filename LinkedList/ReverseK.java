/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null || head.next==null)
        {
            return head;
        }
        
        ListNode current=head;
        ListNode next=null;
        ListNode prev=null;
        
        int count=0;
        
        while(count<k && current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        
        if(count==k)
        {
               
            if(next!=null){
                head.next=reverseKGroup(next,k);
            }
        }
        else
        {
            ListNode tempPrev=null;
            ListNode tempCurrent=prev;
            ListNode tempNext=null;
            while(count>0)
            {
                tempNext=tempCurrent.next;
                tempCurrent.next=tempPrev;
                tempPrev=tempCurrent;
                tempCurrent=tempNext;
                count--; 
                 
            }
            
            return tempPrev;
        }
        
        return prev;
        
    }
}