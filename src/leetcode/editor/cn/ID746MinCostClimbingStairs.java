package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID746MinCostClimbingStairs{
	public static void main(String[] args) {
		Solution solution = new ID746MinCostClimbingStairs().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
		int len = cost.length;
		// 到达第i台阶所花费的最少体力为dp[i]
		int[] dp = new int[len + 1];

		// 从下标为 0 或下标为 1 的台阶开始，因此支付费用为0
		dp[0] = 0;
		dp[1] = 0;

		for (int i = 2; i <= len ; i++) {
			dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
		}
		return dp[len];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
