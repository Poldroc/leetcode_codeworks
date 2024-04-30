package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID279PerfectSquares{
	public static void main(String[] args) {
		Solution solution = new ID279PerfectSquares().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSquares(int n) {
		int max = Integer.MAX_VALUE;
		int[] dp = new int[n + 1];
		// 初始化
		for (int j = 0; j <= n; j++) {
			dp[j] = max;
		}
		// 当和为0时，组合的个数为0
		dp[0] = 0;
		// 遍历背包
		for (int j = 1; j <= n; j++) {
			// 遍历物品
			for (int i = 1; i * i <= j; i++) {
				dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
			}
		}
		return dp[n];
	}

}
//leetcode submit region end(Prohibit modification and deletion)

}
