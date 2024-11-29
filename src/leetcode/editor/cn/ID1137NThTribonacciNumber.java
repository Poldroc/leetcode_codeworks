package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1137NThTribonacciNumber {
    public static void main(String[] args) {
        Solution solution = new ID1137NThTribonacciNumber().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int tribonacci(int n) {
            int[] dp = new int[38];

            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            for (int i = 3; i < n + 1; i++) {
                dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
            }
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
