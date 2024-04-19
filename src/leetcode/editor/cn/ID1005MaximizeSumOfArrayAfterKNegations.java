package leetcode.editor.cn;

import java.util.*;
import java.util.stream.IntStream;

import leetcode.editor.util.*;

public class ID1005MaximizeSumOfArrayAfterKNegations {
    public static void main(String[] args) {
        Solution solution = new ID1005MaximizeSumOfArrayAfterKNegations().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
			// 绝对值大小降序
			nums = Arrays.stream(nums)
					.boxed()
					.sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
					.mapToInt(Integer::intValue)
					.toArray();
			int len = nums.length;
			for (int i = 0; i < len; i++) {
				// 从前向后遍历，遇到负数将其变为正数，同时K--
				if (nums[i] < 0 && k > 0) {
					nums[i] = -nums[i];
					k--;
				}
			}
			// 如果K还大于0，那么反复转变数值最小的元素，将K用完
			if (k % 2 == 1) nums[len - 1] = -nums[len - 1];
			return Arrays.stream(nums).sum();
		}
    }
//leetcode submit region end(Prohibit modification and deletion)

}
