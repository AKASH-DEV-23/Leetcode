package LinkedList;

public class RemoveDuplicateFromSortedList_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        slow.next = fast;
        while (fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;
            }
            if (slow.next != fast) {
                slow.next = fast.next;
                fast = slow.next;
                slow.next = fast;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }

}
