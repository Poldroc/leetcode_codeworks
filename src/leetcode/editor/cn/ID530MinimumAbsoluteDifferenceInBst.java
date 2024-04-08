package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID530MinimumAbsoluteDifferenceInBst {
    public static void main(String[] args) {
        Solution solution = new ID530MinimumAbsoluteDifferenceInBst().new Solution();
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
        // 记录上一个遍历的节点
        TreeNode pre;
        int result = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode root) {
            if (root == null) return 0;
            traversal(root);
            return result;
        }

        public void traversal(TreeNode root) {
            if (root == null) return;
            // 左
            traversal(root.left);
            // 中
            if (pre != null) {
                result = Math.min(result, root.val - pre.val);
            }
            pre = root;
            traversal(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
