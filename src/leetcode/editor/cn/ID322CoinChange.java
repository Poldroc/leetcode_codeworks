package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID322CoinChange {
    public static void main(String[] args) {
        Solution solution = new ID322CoinChange().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int coinChange(int[] coins, int amount) {
            // dp[j]：凑足总额为j所需钱币的最少个数为dp[j]
            /**
             * 凑足总额为j - coins[i]的最少个数为dp[j - coins[i]]，那么只需要加上一个钱币coins[i]即dp[j - coins[i]] + 1就是dp[j]（考虑coins[i]）
             * 所以dp[j] 要取所有 dp[j - coins[i]] + 1 中最小的。
             * 递推公式：dp[j] = min(dp[j - coins[i]] + 1, dp[j]);
             */
            int max = Integer.MAX_VALUE;
            int[] dp = new int[amount + 1];
            // 初始化dp数组为最大值
            Arrays.fill(dp, max);
            // 当金额为0时需要的硬币数为0
            dp[0] = 0;
            for (int i = 0; i < coins.length; i++) {
                for (int j = coins[i]; j <= amount; j++) {
                    //只有dp[j-coins[i]]不是初始最大值时，该位才有选择的必要
                    if (dp[j - coins[i]] != max) {
                        //选择硬币数目最小的情况
                        dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                    }
                }
            }
            return dp[amount] == max ? -1 : dp[amount];


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
