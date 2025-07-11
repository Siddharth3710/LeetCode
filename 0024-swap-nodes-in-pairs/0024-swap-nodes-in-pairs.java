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
    public ListNode swapPairs(ListNode head) {
        ListNode kratos=new ListNode(0);
        kratos.next=head;
        ListNode curr=kratos;

        while(curr.next!=null &&curr.next.next!=null){
            ListNode fir=curr.next;
            ListNode sec=curr.next.next;

            fir.next=sec.next;
            sec.next=fir;
            curr.next=sec;

            curr=fir;
        }
        return kratos.next;
    }
}