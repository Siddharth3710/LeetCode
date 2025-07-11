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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode kra=new ListNode(0);
        kra.next=head;
        ListNode prev=kra;

        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode cur=prev.next;

        for(int i=0;i<right-left;i++){
            ListNode temp=cur.next;
            cur.next=temp.next;
            temp.next=prev.next;
            prev.next=temp;
        }

        return kra.next;
       
       
    }
}