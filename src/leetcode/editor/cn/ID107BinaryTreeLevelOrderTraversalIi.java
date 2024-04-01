package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID107BinaryTreeLevelOrderTraversalIi {
    public static void main(String[] args) {
        Solution solution = new ID107BinaryTreeLevelOrderTraversalIi().new Solution();
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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            Deque<TreeNode> que = new LinkedList<>();

            if (root == null) {
                return list;
            }

            que.offerLast(root);
            while (!que.isEmpty()) {
                List<Integer> levelList = new ArrayList<>();

                int levelSize = que.size();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode peek = que.peekFirst();
                    levelList.add(que.pollFirst().val);

                    if (peek.left != null) {
                        que.offerLast(peek.left);
                    }
                    if (peek.right != null) {
                        que.offerLast(peek.right);
                    }
                }
                list.add(levelList);
            }

            List<List<Integer>> result = new ArrayList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                result.add(list.get(i));
            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
