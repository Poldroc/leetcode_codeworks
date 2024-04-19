package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID78Subsets{
	public static void main(String[] args) {
		Solution solution = new ID78Subsets().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	List<List<Integer>> res = new ArrayList<>();
	LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
		backtracking(nums,0);
		return res;
    }

	public void backtracking(int[] nums, int startIndex) {
		res.add(new ArrayList<>(path));
		if (startIndex >=nums.length){
			return;
		}
		for (int i = startIndex; i < nums.length; i++){
			path.add(nums[i]);
			backtracking(nums, i + 1);
			path.removeLast();
		}

	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
