package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1143LongestCommonSubsequence{
	public static void main(String[] args) {
		Solution solution = new ID1143LongestCommonSubsequence().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
		// dp[i][j]：长度为[0, i - 1]的字符串text1与长度为[0, j - 1]的字符串text2的最长公共子序列为dp[i][j]
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];
		for (int i = 1 ; i <= text1.length() ; i++) {
			char char1 = text1.charAt(i - 1);
			for (int j = 1; j <= text2.length(); j++) {
				char char2 = text2.charAt(j - 1);
				if (char1 == char2) { // 开始列出状态转移方程
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[text1.length()][text2.length()];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
