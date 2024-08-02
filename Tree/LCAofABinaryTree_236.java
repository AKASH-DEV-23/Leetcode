package Tree;

public class LCAofABinaryTree_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return root;
        if (root == p || root == q)
            return root;
            
        TreeNode leftN = lowestCommonAncestor(root.left, p, q);
        TreeNode rightN = lowestCommonAncestor(root.right, p, q);

        if (leftN != null && rightN != null)
            return root;
        if (leftN != null)
            return leftN;
        return rightN;
    }
}
