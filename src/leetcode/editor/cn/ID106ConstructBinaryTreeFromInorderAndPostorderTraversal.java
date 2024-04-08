package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID106ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ID106ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
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
        Map<Integer, Integer> map;  // 方便根据数值查找位置

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            map = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                // 用map保存中序序列的数值对应位置
                map.put(inorder[i], i);
            }
            // 前闭后开
            return findNode(inorder, 0, inorder.length, postorder, 0, postorder.length);
        }

        private TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
            if (inBegin >= inEnd || postBegin >= postEnd) {
                return null;
            }
            // 找到后序遍历的最后一个元素在中序遍历中的位置
            Integer rootIndex = map.get(postorder[postEnd - 1]);
            TreeNode root = new TreeNode(inorder[rootIndex]);
            int lenOfLeft = rootIndex - inBegin;
            root.left = findNode(inorder, inBegin, rootIndex, postorder, postBegin, postBegin + lenOfLeft);
            root.right = findNode(inorder, rootIndex + 1, inEnd, postorder, postBegin + lenOfLeft, postEnd - 1);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
