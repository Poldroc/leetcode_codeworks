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
                // 说明再跳一步就到终点
                if (maxDistance >= nums.length - 1) {
                    count++;
                    break;
                }
                // 说明当前覆盖的最大区域内 下一跳还是无法到达终点,次数+1
                if (i == curDistance) {
                    curDistance = maxDistance;
                    count++;
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
