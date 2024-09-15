package Tree;

import java.util.List;
import java.util.ArrayList;

public class BTInorderTraversal_94 {
  List<Integer> list = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {
    inorder(root);
    return list;
  }

  private void inorder(TreeNode root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    list.add(root.val);
    inorder(root.right);
  }
}