package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID516LongestPalindromicSubsequence{
	public static void main(String[] args) {
		Solution solution = new ID516LongestPalindromicSubsequence().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindromeSubseq(String s) {
        // dp[i][j]：字符串s在[i, j]范围内最长的回文子序列的长度为dp[i][j]。
		int len = s.length();
		int[][] dp = new int[len + 1][len + 1];
		for (int i = len - 1; i >= 0; i--) { // 从后往前遍历 保证情况不漏
			dp[i][i] = 1; // 初始化
			for (int j = i + 1; j < len; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1] + 2;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], Math.max(dp[i][j], dp[i][j - 1]));
				}
			}
		}
		return dp[0][len - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
