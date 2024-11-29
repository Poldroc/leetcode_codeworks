package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1448CountGoodNodesInBinaryTree {
    public static void main(String[] args) {
        Solution solution = new ID1448CountGoodNodesInBinaryTree().new Solution();
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
        public int goodNodes(TreeNode root) {
            return dfs(root, Integer.MIN_VALUE);
        }

        public int dfs(TreeNode root, int pathMax) {
            if (root == null) {
                return 0;
            }
            int res = 0;
            if (root.val >= pathMax) {
                res++;
                pathMax = root.val;
            }
            res += dfs(root.left, pathMax) + dfs(root.right, pathMax);
            return res;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
