package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID235LowestCommonAncestorOfABinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID235LowestCommonAncestorOfABinarySearchTree().new Solution();
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
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) { // 递归结束条件
			return root;
		}

		// 后序遍历
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if(left == null && right == null) { // 若未找到节点 p 或 q
			return null;
		}else if(left == null && right != null) { // 若找到一个节点
			return right;
		}else if(left != null && right == null) { // 若找到一个节点
			return left;
		}else { // 若找到两个节点
			return root;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
