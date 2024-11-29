package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID437PathSumIii {
    public static void main(String[] args) {
        Solution solution = new ID437PathSumIii().new Solution();
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
        public int pathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return 0;
            }
            // 计算节点往下满足条件的路径数
            int res = rootSum(root, targetSum);
            // 递归每个节点的子节点
            res += pathSum(root.left, targetSum);
            res += pathSum(root.right, targetSum);
            return res;
        }

        private int rootSum(TreeNode root, long targetSum) {
            if (root == null) {
                return 0;
            }
            int res = 0;
            int val = root.val;
            if (val == targetSum) {
                res++;
            }
            res += rootSum(root.left, targetSum - val);
            res += rootSum(root.right, targetSum - val);
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
