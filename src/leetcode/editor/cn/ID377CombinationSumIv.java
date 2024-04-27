package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID377CombinationSumIv{
	public static void main(String[] args) {
		Solution solution = new ID377CombinationSumIv().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int combinationSum4(int[] nums, int target) {
		// dp[i]: 凑成目标正整数为i的排列个数为dp[i]
		int[] dp = new int[target+1];
		dp[0] =1;
		for (int i = 0; i <= target; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i >= nums[j]) {
					dp[i] += dp[i - nums[j]];
				}
			}
		}
		return dp[target];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
