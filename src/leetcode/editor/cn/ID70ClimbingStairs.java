package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID70ClimbingStairs{
	public static void main(String[] args) {
		Solution solution = new ID70ClimbingStairs().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <=n; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
