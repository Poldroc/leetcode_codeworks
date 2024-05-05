package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID718MaximumLengthOfRepeatedSubarray {
    public static void main(String[] args) {
        Solution solution = new ID718MaximumLengthOfRepeatedSubarray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findLength(int[] nums1, int[] nums2) {
            // dp[i][j] ：以下标i - 1为结尾的A，和以下标j - 1为结尾的B，最长重复子数组长度为dp[i][j]。
            int[][] dp = new int[nums1.length + 1][nums2.length + 1];
            int res = 0;
            for (int i = 1; i < nums1.length + 1; i++) {
                for (int j = 1; j < nums2.length + 1; j++) {
                    if (nums1[i - 1] == nums2[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        res = Math.max(res, dp[i][j]);
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
