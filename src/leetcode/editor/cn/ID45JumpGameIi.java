package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID45JumpGameIi {
    public static void main(String[] args) {
        Solution solution = new ID45JumpGameIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int jump(int[] nums) {
            if (nums == null || nums.length == 0 || nums.length == 1) {
                return 0;
            }
            // 记录跳跃的次数
            int count = 0;
            // 当前的覆盖最大区域
            int curDistance = 0;
            // 最大的覆盖区域
            int maxDistance = 0;
            for (int i = 0; i < nums.length; i++) {
                // 在可覆盖区域内更新最大的覆盖区域
                maxDistance = Math.max(maxDistance, i + nums[i]);
                // 说明在当前i，可跳到终点
                if (maxDistance >= nums.length - 1) {
                    return count + 1;
                }
                // 到达当前可覆盖的最大距离，就更新
                if (i == curDistance) {
                    curDistance = maxDistance;
                    // 到达新的当前可覆盖的最大距离，需要跳跃
                    count++;
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
