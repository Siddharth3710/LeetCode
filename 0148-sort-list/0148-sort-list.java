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
    public ListNode sortList(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;

        ArrayList<Integer>a=new ArrayList<>();

    while(temp1!=null){
        a.add(temp1.val);
        temp1=temp1.next;
    }
    Collections.sort(a);

    for(int i=0;i<a.size();i++){
        temp2.val=a.get(i);
        temp2=temp2.next;
    }

    return head;

    }
}