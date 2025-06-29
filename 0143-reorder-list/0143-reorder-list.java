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
    public ListNode middleElement(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverselist(ListNode head)
    {
        ListNode current =head;
        ListNode prev=null;
        while(current!=null)
        {
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }return prev;
    }
    public void reorderList(ListNode head) {
        //Always null check at first to prevent nullpointer Exception
        if(head==null || head.next==null)
        {
            return;
        }
        ListNode mid=middleElement(head);
        // reverse the list from second list;
        ListNode hs=reverselist(mid);
        ListNode hf=head;
        while(hf!=null && hs!=null)
        {
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;

        }
        if(hf!=null)
        {
            hf.next=null;
        }
    }
}