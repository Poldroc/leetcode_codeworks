package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID104MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new ID104MaximumDepthOfBinaryTree().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
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
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);
            int depth = 0;
            while (!que.isEmpty()) {
                int len = que.size();
                while (len > 0) {
                    TreeNode node = que.poll();
                    if (node.left != null) que.offer(node.left);
                    if (node.right != null) que.offer(node.right);
                    len--;
                }
                depth++;
            }
            return depth;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
