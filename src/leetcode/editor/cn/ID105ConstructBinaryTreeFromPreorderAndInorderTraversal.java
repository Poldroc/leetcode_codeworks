package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ID105ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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
        Map<Integer, Integer> map;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            map = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            return findNode(preorder, 0, preorder.length, inorder, 0, inorder.length);
        }

        public TreeNode findNode(int[] preorder, int preBegin, int preEnd, int[] inorder, int inBegin, int inEnd) {
            // 参数里的范围都是前闭后开
            if (preBegin >= preEnd || inBegin >= inEnd) {  // 不满足左闭右开，说明没有元素，返回空树
                return null;
            }
            int rootIndex = map.get(preorder[preBegin]);
            TreeNode root = new TreeNode(inorder[rootIndex]);
            int lenOfLeft = rootIndex - inBegin;  // 保存中序左子树个数，用来确定前序数列的个数
            root.left = findNode(preorder, preBegin + 1, preBegin + 1 + lenOfLeft, inorder, inBegin, rootIndex);
            root.right = findNode(preorder, preBegin + lenOfLeft + 1, preEnd,
                    inorder, rootIndex + 1, inEnd);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
