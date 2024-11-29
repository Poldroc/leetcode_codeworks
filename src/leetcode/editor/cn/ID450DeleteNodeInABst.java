package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID450DeleteNodeInABst{
	public static void main(String[] args) {
		Solution solution = new ID450DeleteNodeInABst().new Solution();
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
    public TreeNode deleteNode(TreeNode root, int key) {
		if (root==null) return root;
		if (root.val > key) root.left = deleteNode(root.left, key);
		if (root.val < key) root.right = deleteNode(root.right, key);
		if (root.val==key){
			// 其左孩子为空，右孩子不为空，删除节点，右孩子补位 ，返回右孩子为根节点
			if (root.left==null) {
				return root.right;
			}else if (root.right == null) {
				return root.left;
			}else { // 左右孩子节点都不为空，则将删除节点的左子树放到删除节点的右子树的最左面节点的左孩子的位置
				// 并返回删除节点右孩子为新的根节点。
				TreeNode cur = root.right;
				while (cur.left != null) {
					cur = cur.left;
				}
				cur.left = root.left;
				root = root.right;
				return root;
			}
		}

		return root;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
