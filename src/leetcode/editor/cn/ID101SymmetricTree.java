package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID101SymmetricTree{
	public static void main(String[] args) {
		Solution solution = new ID101SymmetricTree().new Solution();
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
    public boolean isSymmetric(TreeNode root) {
		return check(root.left, root.right);
    }
	public boolean check(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}

		return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
