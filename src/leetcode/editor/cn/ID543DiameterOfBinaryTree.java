package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;


public class ID543DiameterOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new ID543DiameterOfBinaryTree().new Solution();
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
        int res;

        public int diameterOfBinaryTree(TreeNode root) {
            res = 1;
            depth(root);
            return res - 1;
        }

        public int depth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = depth(node.left);
            int right = depth(node.right);
            res = Math.max(res, left + right + 1);
            return Math.max(left, right) + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
