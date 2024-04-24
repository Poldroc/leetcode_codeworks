package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID343IntegerBreak {
    public static void main(String[] args) {
        Solution solution = new ID343IntegerBreak().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int integerBreak(int n) {
			//dp[i] 为正整数 i 拆分后的结果的最大乘积
            int[] dp = new int[n + 1];
			dp[2]=1;
			for (int i = 3; i <= n; i++) {
				for (int j = 1; j <= i-j; j++) {
					// j把i拆成两个数
					//  j * (i - j) 是单纯的把整数 i 拆分为两个数 也就是 i,i-j ，再相乘
					//  而j * dp[i - j]是将 i 拆分成两个以及两个以上的个数,再相乘。
					dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
				}
			}
			return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
