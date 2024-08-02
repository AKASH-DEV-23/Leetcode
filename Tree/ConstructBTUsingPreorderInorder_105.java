package Tree;

public class ConstructBTUsingPreorderInorder_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int[] idx = new int[] { 0 };
        return solve(preorder, inorder, 0, n - 1, idx);
    }

    private TreeNode solve(int[] preorder, int[] inorder, int start, int end, int[] idx) {
        if (start > end)
            return null;
        int nodeVal = preorder[idx[0]];
        TreeNode root = new TreeNode(nodeVal);
        idx[0]++;
        int i = start;
        for (; i < end; i++) {
            if (inorder[i] == nodeVal) {
                break;
            }
        }
        root.left = solve(preorder, inorder, start, i - 1, idx);
        root.right = solve(preorder, inorder, i + 1, end, idx);
        return root;
    }
}
