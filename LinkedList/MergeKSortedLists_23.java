package LinkedList;

public class MergeKSortedLists_23 {
    private static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l2.next, l1);
            return l2;
        }
    }

    private static ListNode partitionAndMerge(int start, int end, ListNode[] lists) {
        if (start == end) {
            return lists[start];
        }
        while (start < end) {
            int mid = (start + end) / 2;
            ListNode L1 = partitionAndMerge(start, mid, lists);
            ListNode L2 = partitionAndMerge(mid + 1, end, lists);
            return mergeTwoList(L1, L2);
        }
        return null;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        return partitionAndMerge(0, lists.length - 1, lists);
    }

    public static void main(String[] args) {

    }
}
