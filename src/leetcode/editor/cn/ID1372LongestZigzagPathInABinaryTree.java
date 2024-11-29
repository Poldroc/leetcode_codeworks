package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1372LongestZigzagPathInABinaryTree{
    public static void main(String[] args) {
        Solution solution = new ID1372LongestZigzagPathInABinaryTree().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int longestZigZag(TreeNode root) {
        return Math.max(dfs(root.left,1,0),dfs(root.right,-1,0));
    }

    private int dfs(TreeNode root,int direction,int len){
        if (root == null){
            return len;
        }
        // 上一个是往左
        if (direction == 1){
            // 往右或者往左重制
            return Math.max(dfs(root.right,-1,len+1),dfs(root.left,1,0));
        }else {
            return Math.max(dfs(root.left,1,len+1),dfs(root.right,-1,0));
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
