package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID145BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ID145BinaryTreePostorderTraversal().new Solution();
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
            public List<Integer> postorderTraversal(TreeNode root) {
                List<Integer> result = new ArrayList<>();
                if (root == null) {
                    return result;
                }
                Deque<TreeNode> stack = new LinkedList<>();
                // 后序遍历顺序 左-右-中 入栈顺序：中-左-右 出栈顺序：中-右-左， 最后翻转结果
                stack.push(root);
                while (!stack.isEmpty()) {
                    TreeNode node = stack.peek();
                    if (node != null) {
                        stack.pop();

                        stack.push(node);
                        stack.push(null);
                        if (node.right != null) stack.push(node.right);
                        if (node.left != null) stack.push(node.left);
                    } else {
                        stack.pop();
                        node = stack.peek();
                        stack.pop();
                        result.add(node.val);
                    }
                }
                return result;
            }
        }
//leetcode submit region end(Prohibit modification and deletion)

    }
