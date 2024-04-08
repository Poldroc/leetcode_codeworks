package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID501FindModeInBinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID501FindModeInBinarySearchTree().new Solution();
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
	ArrayList<Integer> resList;
	int maxCount;
	int count;
	TreeNode pre;
    public int[] findMode(TreeNode root) {
		resList = new ArrayList<>();
		maxCount = 0;
		count = 0;
		pre = null;
		findMode1(root);
		int[] res = new int[resList.size()];
		for (int i = 0; i < resList.size(); i++) {
			res[i] = resList.get(i);
		}
		return res;
    }
	public void findMode1(TreeNode root) {
		if (root == null) {
			return;
		}
		findMode1(root.left);

		int rootValue = root.val;
		// 计数
		if (pre == null || rootValue != pre.val) {
			count = 1;
		} else {
			count++;
		}
		// 更新结果以及maxCount
		if (count > maxCount) {
			resList.clear();
			resList.add(rootValue);
			maxCount = count;
		} else if (count == maxCount) {
			resList.add(rootValue);
		}
		pre = root;

		findMode1(root.right);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
