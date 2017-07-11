
You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7

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
        
        Stack<Integer> list1=new Stack<>();
        Stack<Integer> list2=new Stack<>();
        
        while(l1!=null)
        {
            list1.push(l1.val);
            l1=l1.next;
        }
        
        while(l2 != null) {
            list2.push(l2.val);
            l2 = l2.next;
        }
        
        
        int sum=0;
        int rem=0;
        ListNode head=null;
        
        while(!list1.empty() || !list2.empty() ||rem==1)
        {
            if (!list1.empty()) sum += list1.pop();
            if (!list2.empty()) sum += list2.pop();
            sum=sum+rem;
            
            if(sum>9)
            {
                rem=1;
            }
            else
            {
                rem=0;
            }
            sum=sum%10;
            if(head==null)
            {
                ListNode listNode=new ListNode(sum);
                listNode.next=null;
                head=listNode;
            }
            else
            {
                ListNode listNodeOne=new ListNode(sum);
                listNodeOne.next=head;
                head=listNodeOne;
            }
            
            sum=0;
            
            
        }
        
        return head;
        
        
    }
}