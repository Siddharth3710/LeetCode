class Solution {

    public ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Step 2: Reverse a list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode midNode = mid(head);
        ListNode secondHalf = reverse(midNode); 

        ListNode firstHalf = head;
        ListNode temp = secondHalf;

        while (temp != null) {
            if (firstHalf.val != temp.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }
}
