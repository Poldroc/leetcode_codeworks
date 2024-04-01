package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID94BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ID94BinaryTreeInorderTraversal().new Solution();
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
            public List<Integer> inorderTraversal(TreeNode root) {
                // 中序遍历顺序: 左-中-右 入栈顺序： 左-右
                List<Integer> result = new ArrayList<>();
                if (root == null) {
                    return result;
                }
                Deque<TreeNode> stack = new LinkedList<>();
                TreeNode cur = root;
                while (cur != null || !stack.isEmpty()) {
                    // 将树左面的节点压入
                    if (cur != null) {
                        stack.push(cur);
                        cur = cur.left;
                    } else { // 到最低层
                        cur = stack.pop();
                        result.add(cur.val);
                        cur = cur.right;
                    }
                }
                return result;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
