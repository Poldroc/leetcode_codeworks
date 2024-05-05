package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID300LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Solution solution = new ID300LongestIncreasingSubsequence().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLIS(int[] nums) {
            // dp[i]表示i之前包括i的以nums[i]结尾的最长递增子序列的长度
            int[] dp = new int[nums.length];
            int res = 1;
            Arrays.fill(dp,1);
            for (int i = 1; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    // 位置i的最长升序子序列等于j从0到i-1各个位置的最长升序子序列 + 1 的最大值。
                    if (nums[i]>nums[j])
                        dp[i] = Math.max(dp[i],dp[j]+1);
                }
                res = Math.max(res,dp[i]);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
