package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID128LongestConsecutiveSequence {
    public static void main(String[] args) {
        Solution solution = new ID128LongestConsecutiveSequence().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            Arrays.sort(nums);
            int res = 1;
            int max = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] - nums[i] == 1) {
                    res += 1;
                } else if (nums[i + 1] - nums[i] == 0) {
                } else {
                    max = Math.max(res, max);
                    res = 1;
                }
            }

            return Math.max(max, res);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
