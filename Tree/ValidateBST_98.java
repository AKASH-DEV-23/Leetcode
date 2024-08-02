package Tree;

public class ValidateBST_98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, long minVal, long maxVal) {
        if (root == null)
            return true;
        if (minVal <= root.val || maxVal >= root.val)
            return false;

        return isValid(root.left, minVal, root.val) && isValid(root, root.val, maxVal);
    }

}