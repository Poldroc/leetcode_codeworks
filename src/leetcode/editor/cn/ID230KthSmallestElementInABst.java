package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID230KthSmallestElementInABst {
    public static void main(String[] args) {
        Solution solution = new ID230KthSmallestElementInABst().new Solution();
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
        int k, res;

        public int kthSmallest(TreeNode root, int k) {
            this.k = k;
            dfs(root);
            return res;
        }

        void dfs(TreeNode root){
            if (root==null)return;;
            dfs(root.left);
            if (k == 0) return;
            if (--k==0) res = root.val;
            dfs(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
