package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID213HouseRobberIi {
    public static void main(String[] args) {
        Solution solution = new ID213HouseRobberIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0)
                return 0;
            int len = nums.length;
            if (len == 1)
                return nums[0];
            if (len==2)
                return Math.max(nums[0],nums[1]);
            return Math.max(robAction(nums, 0, len - 1), robAction(nums, 1, len));
        }

        private int robAction(int[] nums, int start, int end) {
            int[] dp = new int[nums.length];
            dp[start] = nums[start];
            dp[start + 1] = Math.max(dp[start], nums[start + 1]);
            for (int i = start + 2; i < end; i++) {
                dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
            }
            return dp[end-1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
