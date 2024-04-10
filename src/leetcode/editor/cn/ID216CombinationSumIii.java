package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID216CombinationSumIii{
	public static void main(String[] args) {
		Solution solution = new ID216CombinationSumIii().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	List<List<Integer>> result = new ArrayList<>();
	LinkedList<Integer> path = new LinkedList<>();


	public List<List<Integer>> combinationSum3(int k, int n) {
		backTracking(n, k, 1, 0);
		return result;
    }
	private void backTracking(int targetSum, int k, int startIndex, int sum) {
		// 减枝
		if (sum > targetSum) {
			return;
		}

		if (path.size() == k) {
			if (sum == targetSum) result.add(new ArrayList<>(path));
			return;
		}


		/**
		 * 减枝 9 - (k - path.size()) + 1
		 * 已经选择的元素个数：path.size();
		 *
		 * 还需要的元素个数为: k - path.size();
		 *
		 * 在集合n中至多要从该起始位置 : n - (k - path.size()) + 1，开始遍历
		 */
		for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
			path.add(i);
			sum += i;
			backTracking(targetSum, k, i + 1, sum);
			//回溯
			path.removeLast();
			//回溯
			sum -= i;
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
