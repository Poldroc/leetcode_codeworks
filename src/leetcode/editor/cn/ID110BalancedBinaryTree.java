package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID110BalancedBinaryTree {
    public static void main(String[] args) {
        Solution solution = new ID110BalancedBinaryTree().new Solution();
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
        /**
         * 递归法
         */
        public boolean isBalanced(TreeNode root) {
            return getHeight(root) != -1;
        }

        private int getHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = getHeight(root.left);
            if (leftHeight == -1) {
                return -1;
            }
            int rightHeight = getHeight(root.right);
            if (rightHeight == -1) {
                return -1;
            }
            // 左右子树高度差大于1，return -1表示已经不是平衡树了
            if (Math.abs(leftHeight - rightHeight) > 1) {
                return -1;
            }
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
