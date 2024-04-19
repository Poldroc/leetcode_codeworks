package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID46Permutations{
	public static void main(String[] args) {
		Solution solution = new ID46Permutations().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
	LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
	boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
		if (nums.length == 0){
			return result;
		}
		used = new boolean[nums.length];
		permuteHelper(nums);
		return result;
    }
	private void permuteHelper(int[] nums){
		if (path.size()==nums.length){
			result.add(new ArrayList<>(path));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (used[i]){
				continue;
			}
			used[i] = true;
			path.add(nums[i]);
			permuteHelper(nums);
			path.removeLast();
			used[i] = false;

		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
