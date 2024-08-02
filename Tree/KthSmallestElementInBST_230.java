package Tree;

public class KthSmallestElementInBST_230 {
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
    int count = 0;
    int ans = 0;
    private void inorder(TreeNode root, int k){
        if(root == null)    return;
        inorder(root.left,k);
        count++;
        if(count == k){
            ans = root.val;
        }
        inorder(root.right,k);
    }
}
