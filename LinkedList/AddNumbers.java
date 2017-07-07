You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8






/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode resultOne=null;
        ListNode temp=null;
        int rem=0;
        
        while(l1!=null && l2!=null)
        {
            int result=l1.val+l2.val+rem;
            
            if(result>9)
            {
                rem=1;
                result=result%10;
            }
            else
            {
               rem=0; 
            }
            ListNode listNode=new ListNode(result);
            
            if(resultOne==null)
            {
                resultOne=listNode;
                temp=listNode;
            }
            else
            {
                temp.next=listNode;
                temp=listNode;
            }
            
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null)
        {
            int result=l1.val+rem;
            if(result>9)
            {
                rem=1;
                result=result%10;
            }
            else
            {
               rem=0; 
            }
            ListNode listNode=new ListNode(result);
            temp.next=listNode;
            temp=listNode;
            l1=l1.next;
        }
        
        while(l2!=null)
        {
            int result=l2.val+rem;
            if(result>9)
            {
                rem=1;
                result=result%10;
            }
            else
            {
               rem=0; 
            }
            ListNode listNode=new ListNode(result);
            temp.next=listNode;
            temp=listNode;
            l2=l2.next;
        }
        
        if(rem==1)
        {
           ListNode listNode=new ListNode(1);
            temp.next=listNode;
            temp=listNode;
            
        }
        
        return resultOne;
        
        
    }
}