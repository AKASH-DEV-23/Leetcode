package LinkedList;

public class ReverselinkedList_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }
        ListNode current = temp.next;
        ListNode leftNode = current;
        ListNode prev = null;
        for (int i = 0; i <= (right - left); i++) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        temp.next = prev;
        leftNode.next = current;
        return dummy.next;

    }
}
