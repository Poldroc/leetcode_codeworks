package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1161MaximumLevelSumOfABinaryTree {
    public static void main(String[] args) {
        Solution solution = new ID1161MaximumLevelSumOfABinaryTree().new Solution();
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
        public int maxLevelSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            int max = Integer.MIN_VALUE;
            int res = 0;
            int k = 1;
            queue.offer(root);
            while (!queue.isEmpty()){
                int len = queue.size();
                int sum=0;
                for (int i=0;i<len;i++){
                    TreeNode poll = queue.poll();
                    sum+= poll.val;
                    if (poll.left!=null) queue.offer(poll.left);
                    if (poll.right!=null) queue.offer(poll.right);
                }
                if (sum>max){
                    max=sum;
                    res=k;
                }
                k++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
