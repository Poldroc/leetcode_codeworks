package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID55JumpGame {
    public static void main(String[] args) {
        Solution solution = new ID55JumpGame().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canJump(int[] nums) {
            if (nums.length == 1) {
                return true;
            }
            // 覆盖范围, 初始覆盖范围应该是0，因为下面的迭代是从下标0开始的
            int coverRange = 0;
            // 在覆盖范围内更新最大的覆盖范围
            for (int i = 0; i <= coverRange; i++) {
                coverRange = Math.max(coverRange, i + nums[i]);
                if (coverRange >= nums.length - 1) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
