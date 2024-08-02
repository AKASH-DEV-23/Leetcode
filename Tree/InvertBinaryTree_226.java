package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode node = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(node);
        return root;
    }

    public static TreeNode invertTrees(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
