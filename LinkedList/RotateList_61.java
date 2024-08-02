package LinkedList;

public class RotateList_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int length = 0;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        length++;
        temp.next = head;
        int rotate = length - k % length;
        temp = head;
        while (rotate-- > 1) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }

}
