// Write a program to find the node at which the intersection of two singly linked lists begins.


// For example, the following two linked lists:

// A:          a1 → a2
                   // ↘
                     // c1 → c2 → c3
                   // ↗            
// B:     b1 → b2 → b3



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