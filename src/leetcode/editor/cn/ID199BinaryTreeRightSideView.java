package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID199BinaryTreeRightSideView {
    public static void main(String[] args) {
        Solution solution = new ID199BinaryTreeRightSideView().new Solution();
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Deque<TreeNode> que = new LinkedList<>();

            if (root == null) {
                return list;
            }

            que.offer(root);
            while (!que.isEmpty()) {
                int levelSize = que.size();

                for (int i = 0; i < levelSize; i++) {
                    TreeNode poll = que.poll();

                    if (poll.left != null) {
                        que.offer(poll.left);
                    }
                    if (poll.right != null) {
                        que.offer(poll.right);
                    }

                    if (i == levelSize - 1) {
                        list.add(poll.val);
                    }
                }
            }

            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
