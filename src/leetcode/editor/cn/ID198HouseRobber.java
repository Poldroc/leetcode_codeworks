package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID198HouseRobber {
    public static void main(String[] args) {
        Solution solution = new ID198HouseRobber().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rob(int[] nums) {
            // dp[i]：考虑下标i（包括i）以内的房屋，最多可以偷窃的金额为dp[i]。
            if (nums == null || nums.length == 0) return 0;
            if (nums.length == 1) return nums[0];
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(dp[0], nums[1]);
			for (int i = 2; i < nums.length; i++) {
				dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
			}
			return dp[nums.length-1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
