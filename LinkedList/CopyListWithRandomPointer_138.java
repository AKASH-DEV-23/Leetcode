package LinkedList;

public class CopyListWithRandomPointer_138 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = current.next.next;
        }
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        Node dummy = new Node(-1);
        Node copy = dummy;
        current = head;
        while (current != null) {
            copy.next = current.next;
            copy = copy.next;
            current.next = current.next.next;
            current = current.next;
        }
        return dummy.next;
    }
}
