package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID209MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new ID209MinimumSizeSubarraySum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int left = 0, result = Integer.MAX_VALUE, sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                while (sum >= target) {
                    result = Math.min(result, i - left + 1);
                    // 移动左窗口，移除左元素
                    sum -= nums[left++];
                }
            }
            return result == Integer.MAX_VALUE ? 0 : result;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
