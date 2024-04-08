package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID98ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ID98ValidateBinarySearchTree().new Solution();
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
        TreeNode max;

        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }
            boolean left = isValidBST(root.left);
            if (!left) {
                return false;
            }
			// 中序遍历，验证遍历的元素是不是从小到大
            if (max != null && root.val <= max.val) {
                return false;
            }
            max = root;
            return isValidBST(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
