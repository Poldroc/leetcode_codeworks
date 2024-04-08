package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID669TrimABinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID669TrimABinarySearchTree().new Solution();
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
		if (root==null){
			return null;
		}
		if (root.val < low) {
			return trimBST(root.right, low, high);
		}
		if (root.val > high) {
			return trimBST(root.left, low, high);
		}
		// root在[low,high]范围内
		root.left = trimBST(root.left, low, high);
		root.right = trimBST(root.right, low, high);
		return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
