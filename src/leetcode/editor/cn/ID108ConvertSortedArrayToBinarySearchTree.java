package leetcode.editor.cn;


import leetcode.editor.util.*;

public class ID108ConvertSortedArrayToBinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID108ConvertSortedArrayToBinarySearchTree().new Solution();
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
    public TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayToBST(nums, 0, nums.length - 1);
    }
	public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int mid = left + (right - left) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sortedArrayToBST(nums, left, mid-1);
		root.right = sortedArrayToBST(nums, mid + 1, right);
		return root;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
