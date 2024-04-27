package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID518CoinChangeIi{
	public static void main(String[] args) {
		Solution solution = new ID518CoinChangeIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int change(int amount, int[] coins) {
		// dp[j]：凑成总金额j的货币组合数为dp[j]
		int[] dp = new int[amount+1];
		dp[0]=1;
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <=amount  ; j++) {
				dp[j] +=dp[j-coins[i]];
			}
		}
		return dp[amount];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
