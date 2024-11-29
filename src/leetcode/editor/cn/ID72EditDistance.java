package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID72EditDistance{
	public static void main(String[] args) {
		Solution solution = new ID72EditDistance().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minDistance(String word1, String word2) {
		// dp[i][j] 表示以下标i-1为结尾的字符串word1，和以下标j-1为结尾的字符串word2，最近编辑距离为dp[i][j]。
		int m = word1.length();
		int n = word2.length();
		int[][] dp = new int[m + 1][n + 1];
		// 初始化
		for (int i = 1; i <= m; i++) {
			dp[i][0] =  i;
		}
		for (int j = 1; j <= n; j++) {
			dp[0][j] = j;
		}
		for (int i = 1; i <=m; i++) {
			for (int j = 1; j <=n ; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					//
					dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
				}

			}
		}
		return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
