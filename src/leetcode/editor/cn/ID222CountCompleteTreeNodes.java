package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID222CountCompleteTreeNodes {
    public static void main(String[] args) {
        Solution solution = new ID222CountCompleteTreeNodes().new Solution();
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
        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            Deque<TreeNode> queue = new LinkedList<>();
            int result = 0;
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size-- > 0) {
                    TreeNode cur = queue.poll();
                    result++;
                    if (cur.left!=null) {
                        queue.offer(cur.left);
                    }
                    if (cur.right!=null) {
                        queue.offer(cur.right);
                    }
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
