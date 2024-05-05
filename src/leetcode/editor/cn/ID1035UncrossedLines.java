package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1035UncrossedLines{
	public static void main(String[] args) {
		Solution solution = new ID1035UncrossedLines().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int[][] dp = new int[len1 + 1][len2 + 1];

		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2; j++) {
				if (nums1[i - 1] == nums2[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[len1][len2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
