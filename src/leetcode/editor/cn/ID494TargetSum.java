package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID494TargetSum{
	public static void main(String[] args) {
		Solution solution = new ID494TargetSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
		/**
		 * 假设加法的总和为x，那么减法对应的总和就是sum - x。
		 * 所以我们要求的是 x - (sum - x) = target
		 * x = (target + sum) / 2
		 * 此时问题就转化为，装满容量为x的背包，有几种方法。
		 */
		// dp[i][j]：使用 下标为[0, i]的nums[i]能够凑满j（包括j）这么大容量的包，有dp[i][j]种方法。
		int sum = 0;
		for (int num : nums){
			sum+=num;
		}
		if(sum < Math.abs(target)){
			return 0;
		}
		// 如果所求的left数组和为小数，则作为整数数组的nums里的任何元素自然是没有办法凑出这个小数的
		if((sum + target) % 2 != 0) {
			return 0;
		}
		int left = (sum + target) / 2;
		// dp[i][j]：遍历到数组第i个数时， left为j时的能装满背包的方法总数
		int[][] dp = new int[nums.length][left + 1];

		if (nums[0]<=left){
			dp[0][nums[0]]=1;
		}

		// 初始化最左列（dp[i][0])
		// 当从nums数组的索引0到i的部分有n个0时（n > 0)，每个0可以取+/-，因此有2的n次方中可以取到j = 0的方案
		// n = 0说明当前遍历到的数组部分没有0全为正数，因此只有一种方案可以取到j = 0（就是所有数都不取）
		int numZeros = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				numZeros++;
			}
			dp[i][0] = (int) Math.pow(2, numZeros);
		}


		// 递推公式分析：
		// 当nums[i] > j时，这时候nums[i]一定不能取，所以是dp[i - 1][j]种方案数
		// nums[i] <= j时，num[i]可取可不取，因此方案数是dp[i - 1][j] + dp[i - 1][j - nums[i]]
		// 由递推公式可知，先遍历i或j都可
		for(int i = 1; i < nums.length; i++) {
			for(int j = 1; j <= left; j++) {
				if(nums[i] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i]];
				}
			}
		}

		return dp[nums.length - 1][left];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
