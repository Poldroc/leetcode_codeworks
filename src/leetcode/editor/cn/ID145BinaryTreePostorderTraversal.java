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
                Deque<TreeNode> stack1 = new LinkedList<>();
                // 后-右-左
                Deque<TreeNode> stack2 = new LinkedList<>();
                stack1.push(root);
                while (!stack1.isEmpty()){
                    TreeNode pop = stack1.pop();
                    // 后
                    stack2.push(pop);
                    // stack1里面是左-右，弹出来就是右-左
                    if (pop.left!=null) stack1.push(pop.left);
                    if (pop.right!=null) stack1.push(pop.right);
                }
                while (!stack2.isEmpty()){
                    result.add(stack2.pop().val);
                }
                return result;
            }
        }
//leetcode submit region end(Prohibit modification and deletion)
    }

