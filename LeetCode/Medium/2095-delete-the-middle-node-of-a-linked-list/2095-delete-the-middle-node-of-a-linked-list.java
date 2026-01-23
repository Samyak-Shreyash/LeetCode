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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slowNode = head;
        ListNode ctNode = head;
        int ct=0;
        while(ctNode!=null)
        {
            ctNode=ctNode.next;
            ct++;
        }
        if(ct<2)
            return null;
        else if (ct==2){
            head.next=null;
            return head;
            }
        ct/=2;
        while(ct>1)
        {
            slowNode=slowNode.next;
            ct--;
        }
        slowNode.next=slowNode.next.next;
        return head;
    }
}