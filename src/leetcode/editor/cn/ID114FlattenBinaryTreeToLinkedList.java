package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID114FlattenBinaryTreeToLinkedList{
	public static void main(String[] args) {
		Solution solution = new ID114FlattenBinaryTreeToLinkedList().new Solution();
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
	public void flatten(TreeNode root) {
		List<TreeNode> list = new ArrayList<TreeNode>();
		preorderTraversal(root, list);
		int size = list.size();
		for (int i = 1; i < size; i++) {
			TreeNode prev = list.get(i - 1), curr = list.get(i);
			prev.left = null;
			prev.right = curr;
		}
	}

	public void preorderTraversal(TreeNode root, List<TreeNode> list) {
		if (root != null) {
			list.add(root);
			preorderTraversal(root.left, list);
			preorderTraversal(root.right, list);
		}
	}
}

//leetcode submit region end(Prohibit modification and deletion)

}
