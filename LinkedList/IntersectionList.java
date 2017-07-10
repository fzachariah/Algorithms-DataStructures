/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null || headB==null)
        {
            return null;
        }
        
        ListNode tempA=headA;
        ListNode tempB=headB;
        int count=0;
       while(tempA!=null && tempB!=null )
       {
          if(tempA==tempB) 
          {
              return tempA;
          }
          tempA=tempA.next;
          tempB=tempB.next;
           if(tempA==null && tempB==null)
           {
             break;  
           }
           else if(tempA==null)
           {
               tempA=headB;
           }
            else if(tempB==null)
           {
               tempB=headA;
           }
       }
        
        return null;
        
    }
}