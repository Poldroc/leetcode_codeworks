package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID102BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new ID102BinaryTreeLevelOrderTraversal().new Solution();
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
        public List<List<Integer>> resList = new ArrayList<List<Integer>>();

        public List<List<Integer>> levelOrder(TreeNode root) {
            checkFun02(root);

            return resList;
        }

        public void checkFun02(TreeNode node) {
            if (node == null) return;
            Queue<TreeNode> que = new LinkedList<TreeNode>();
            que.offer(node);
            while (!que.isEmpty()) {
                List<Integer> itemList = new ArrayList<Integer>();
                int len = que.size();
                while (len > 0) {
                    TreeNode tmpNode = que.poll();
                    itemList.add(tmpNode.val);

                    if (tmpNode.left != null) que.offer(tmpNode.left);
                    if (tmpNode.right != null) que.offer(tmpNode.right);
                    len--;
                }
                resList.add(itemList);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
