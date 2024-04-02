package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID404SumOfLeftLeaves {
    public static void main(String[] args) {
        Solution solution = new ID404SumOfLeftLeaves().new Solution();
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
        public int sumOfLeftLeaves(TreeNode root) {
            // 终止条件
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 0;

            int leftValue = sumOfLeftLeaves(root.left);
            // 当遇到左叶子节点的时候，记录数值
            if (root.left != null && root.left.left == null && root.left.right == null) {
                leftValue = root.left.val;
            }
            int rightValue = sumOfLeftLeaves(root.right);
            return leftValue + rightValue;

        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
