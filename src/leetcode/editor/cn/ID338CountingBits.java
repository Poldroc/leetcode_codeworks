package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID338CountingBits {
    public static void main(String[] args) {
        Solution solution = new ID338CountingBits().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] countBits(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 0;
            if (n == 0) return dp;
            for (int i = 1; i <= n; i++) {
                if ((i & 1) == 0) {
                    // 偶数，最小位一定是0，右移一位，1的个数不变
                    dp[i] = dp[i >> 1];
                } else {
                    // 奇数，一定是前一个偶数的1的个数+1
                    dp[i] = dp[i - 1] + 1;
                }
            }
            return dp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
