package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID111MinimumDepthOfBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID111MinimumDepthOfBinaryTree().new Solution();
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
	public int minDepth(TreeNode root){
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int depth = 0;
		while (!queue.isEmpty()){
			int size = queue.size();
			depth++;
			TreeNode cur = null;
			for (int i = 0; i < size; i++) {
				cur = queue.poll();
				//如果当前节点的左右孩子都为空，直接返回最小深度
				if (cur.left == null && cur.right == null){
					return depth;
				}
				if (cur.left != null) queue.offer(cur.left);
				if (cur.right != null) queue.offer(cur.right);
			}
		}
		return depth;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
