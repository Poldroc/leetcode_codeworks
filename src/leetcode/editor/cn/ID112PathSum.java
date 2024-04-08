package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID112PathSum {
    public static void main(String[] args) {
        Solution solution = new ID112PathSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            targetSum -= root.val;
            // 叶子结点
            if (root.left == null && root.right == null) {
                return targetSum == 0;
            }
            if (root.left != null) {
                if (hasPathSum(root.left, targetSum)) {      // 已经找到
                    return true;
                }
            }
            if (root.right != null) {
                if (hasPathSum(root.right, targetSum)) {     // 已经找到
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
