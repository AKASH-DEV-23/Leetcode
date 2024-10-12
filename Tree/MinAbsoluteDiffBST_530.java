package Tree;

public class MinAbsoluteDiffBST_530 {
    private TreeNode prev;
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        prev = null;
        inorder(root);
        return min;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }
}
