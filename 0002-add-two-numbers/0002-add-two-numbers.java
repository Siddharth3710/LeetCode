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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode();
        ListNode res=dum;

        int total=0, car=0;

        while(l1 != null || l2 != null || car != 0){
            total=car;

            if(l1!=null){
                total+=l1.val;
                l1=l1.next;
            }
               if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            int sum=total%10;
             car=total/10;


            dum.next=new ListNode(sum);
            dum=dum.next;
        }
        return res.next;
    }

}