package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID700SearchInABinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID700SearchInABinarySearchTree().new Solution();
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
    public TreeNode searchBST(TreeNode root, int val) {
		if (root==null||root.val==val) return root;
		if (val<root.val){
			return searchBST(root.left,val);
		}else {
			return searchBST(root.right,val);
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
