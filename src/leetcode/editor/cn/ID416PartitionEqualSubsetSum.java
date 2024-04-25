package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID416PartitionEqualSubsetSum{
	public static void main(String[] args) {
		Solution solution = new ID416PartitionEqualSubsetSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartition(int[] nums) {
		int len = nums.length;
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		//总和为奇数，不能平分
		if(sum % 2 != 0) return false;
		// 背包容量
		int target = sum/2;
		// 创建二维状态数组，行：物品索引，列：容量（包括 0）
        /*
        dp[i][j]表示从数组的 [0, i] 这个子区间内挑选一些正整数
          每个数只能用一次，使得这些数的和恰好等于 j。
        */
		int[][] dp = new int[nums.length][target + 1];

		for(int j = nums[0]; j <= target; j++){
			dp[0][j] = nums[0];
		}

		for(int i = 1; i < len; i++){
			for(int j = 0; j <= target; j++){
				if (j < nums[i])
					dp[i][j] = dp[i - 1][j];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
			}
		}

		return dp[len - 1][target] == target;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
