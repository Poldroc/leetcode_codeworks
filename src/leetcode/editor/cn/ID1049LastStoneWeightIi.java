package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1049LastStoneWeightIi{
	public static void main(String[] args) {
		Solution solution = new ID1049LastStoneWeightIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastStoneWeightII(int[] stones) {
		int sum = 0;
		for (int s : stones) {
			sum += s;
		}

		int target = sum / 2;
		//初始化，dp[i][j]为可以放0-i物品，背包容量为j的情况下背包中的最大价值
		int[][] dp = new int[stones.length][target + 1];
		//dp[i][0]默认初始化为0
		//dp[0][j]取决于stones[0]
		for (int j = stones[0]; j <= target; j++) {
			dp[0][j] = stones[0];
		}
		for (int i =1;i< stones.length;i++){
			for (int j = 1; j <= target; j++) {
				if (j<stones[i]){
					dp[i][j]=dp[i-1][j];
				}else {
					dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-stones[i]]+stones[i]);
				}
			}
		}
		return (sum - dp[stones.length - 1][target]) - dp[stones.length - 1][target];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
