package Tree;

public class RangeSumOFBST_938 {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        if (root.val >= low && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        return 0;
    }
}
