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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();

        while(head!=null){
            sb.append(head.val);
            head=head.next;      
        }

         String str = sb.toString();
        int num= Integer.parseInt( str, 2);

        return num;

    }
}