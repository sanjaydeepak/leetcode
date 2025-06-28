/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleElement(head);
        ListNode secondList=reverseNode(mid);
        ListNode rereverse=secondList;
        boolean pallindrome=true;
        while(head!=null && secondList!=null)
        {
            if(head.val!=secondList.val)
            {
                      break;
            }
            head=head.next;
            secondList=secondList.next;
        }
        reverseNode(rereverse);
        if(head==null || secondList==null)
        {
            return true;
        }
        return false;
    }
    public ListNode middleElement(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }return slow;
    }
    public ListNode reverseNode(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        while(current!=null)
        {
            //next need to be in loop.Because the next to be updated
        ListNode next=current.next;
            current.next=prev;
           prev=current;
            current=next;
        }
        return prev;

    }
}