package Tree;

import java.util.ArrayList;

public class FindModeBST_501 {
    int currNum = 0;
    int currFreq = 0;
    int maxFreq = 0;
    ArrayList<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        if (root.val == currNum) {
            currFreq++;
        } else {
            currNum = root.val;
            currFreq = 1;
        }
        if (currFreq > maxFreq) {
            list.clear();
            maxFreq = currFreq;
        }
        if (currFreq == maxFreq) {
            list.add(root.val);
        }
        inorder(root.right);
    }
}
