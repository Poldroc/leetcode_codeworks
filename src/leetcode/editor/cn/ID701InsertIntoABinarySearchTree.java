package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID701InsertIntoABinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID701InsertIntoABinarySearchTree().new Solution();
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
		if(root==null){
			return new TreeNode(val);
		}
		if (root.val<val){
			root.right = insertIntoBST(root.right,val);
		} else  {
			root.left = insertIntoBST(root.left,val);
		}
		return root;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
