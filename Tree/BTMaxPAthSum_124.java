package Tree;

public class BTMaxPAthSum_124 {

    int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        solve(root);
        return maxSum;
    }

    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = solve(root.left);
        int r = solve(root.right);
        int neeche_milgya_answer = l + r + root.val;
        int koi_ek_acha = Math.max(l, r) + root.val;
        int only_root_acha = root.val;
        maxSum = Math.max(maxSum, Math.max(neeche_milgya_answer, Math.max(koi_ek_acha, only_root_acha)));
        return Math.max(koi_ek_acha, only_root_acha);
    }
}
