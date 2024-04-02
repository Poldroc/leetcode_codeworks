package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID257BinaryTreePaths {
    public static void main(String[] args) {
        Solution solution = new ID257BinaryTreePaths().new Solution();
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            // 作为结果中的路径
            List<Integer> paths = new ArrayList<>();
            traversal(root, paths, res);
            return res;

        }

        private void traversal(TreeNode root, List<Integer> paths, List<String> res) {
            // 前序遍历，中
            paths.add(root.val);
            // 遇到叶子结点
            if (root.left == null && root.right == null) {
                // 得到一条路径
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < paths.size() - 1; i++) {
                    sb.append(paths.get(i)).append("->");
                }
                sb.append(paths.get(paths.size() - 1));
                res.add(sb.toString());
                return;
            }
            // 递归和回溯是同时进行，所以要放在同一个花括号里
            if (root.left != null) { // 左
                traversal(root.left, paths, res);
                paths.remove(paths.size() - 1);// 回溯
            }
            if (root.right != null) { // 右
                traversal(root.right, paths, res);
                paths.remove(paths.size() - 1);// 回溯
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
