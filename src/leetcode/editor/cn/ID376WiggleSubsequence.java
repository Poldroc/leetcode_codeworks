package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID376WiggleSubsequence {
    public static void main(String[] args) {
        Solution solution = new ID376WiggleSubsequence().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int wiggleMaxLength(int[] nums) {
            if (nums.length <= 1) {
                return nums.length;
            }
            int curDiff = 0;
            int preDiff = 0;
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                // 得到当前差值
                curDiff = nums[i] - nums[i - 1];
                // 如果当前差值和上一个差值为一负一正
                // 等于0的情况表示初始时的preDiff
                if ((curDiff > 0 && preDiff <= 0) ||
                        (curDiff < 0 && preDiff >= 0)) {
                    count++;
                    preDiff = curDiff;
                }

            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
