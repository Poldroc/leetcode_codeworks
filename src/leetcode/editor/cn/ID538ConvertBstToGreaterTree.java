package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID538ConvertBstToGreaterTree{
	public static void main(String[] args) {
		Solution solution = new ID538ConvertBstToGreaterTree().new Solution();
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
	int sum;
    public TreeNode convertBST(TreeNode root) {
		sum = 0;
		convertBST1(root);
		return root;
    }
	// 按右中左顺序遍历，累加即可
	public void convertBST1(TreeNode root) {
		if (root == null) {
			return;
		}
		convertBST1(root.right);
		sum += root.val;
		root.val = sum;
		convertBST1(root.left);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
