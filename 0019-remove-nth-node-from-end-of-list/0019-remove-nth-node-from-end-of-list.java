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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode temp=head;
        while(temp!=null)
        {
            i++;
            temp=temp.next;
        }
        i-=n;
        temp=head;
        if(i==0)
            head=temp.next;
        while(temp!=null)
        {
            i--;
            if(i==0 && temp.next !=null)
                temp.next=temp.next.next;
            temp=temp.next;
        }
        return head;
    }
}