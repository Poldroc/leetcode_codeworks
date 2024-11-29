package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID714BestTimeToBuyAndSellStockWithTransactionFee{
    public static void main(String[] args) {
        Solution solution = new ID714BestTimeToBuyAndSellStockWithTransactionFee().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        // dp[i][0]：第i天交易完后手里没有股票的最大利润
        // dp[i][1]：第i天交易完后手里持有一支股票的最大利润
        dp[0][0] = 0;
        dp[0][1] = -prices[0]; // 第0天持有股票，支出prices[0]买入
        for (int i = 1; i < n; i++) {
            // 第i天没有股票：前一天没有、前一天有今天卖出
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            // 第i天有股票：前一天有、前一天没有今天买入
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[n-1][0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
