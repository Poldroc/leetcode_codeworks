package leetcode.editor.cn;

import java.util.*;

public class ID144BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ID144BinaryTreePreorderTraversal().new Solution();
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root==null) return result;
            Deque<TreeNode> stack = new LinkedList<>();
            stack.push(root);
            while (!stack.isEmpty()){
                TreeNode pop = stack.pop();
                result.add(pop.val);
                if (pop.right!=null)stack.push(pop.right);
                if (pop.left!=null) stack.push(pop.left);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
