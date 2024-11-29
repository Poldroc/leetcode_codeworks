package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1493LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        Solution solution = new ID1493LongestSubarrayOf1sAfterDeletingOneElement().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestSubarray(int[] nums) {
            int ans = 0;
            int left = 0;

            int cnt = 0;
            for (int right = 0; right < nums.length; right++) {
                cnt += 1 - nums[right];
                while (cnt > 1) {
                    cnt += nums[left++] - 1;
                }
                ans = Math.max(ans, right - left + 1 - cnt);
            }
            return ans == nums.length ? ans - 1 : ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
