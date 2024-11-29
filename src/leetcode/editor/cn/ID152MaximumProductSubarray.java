package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID152MaximumProductSubarray {
    public static void main(String[] args) {
        Solution solution = new ID152MaximumProductSubarray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProduct(int[] nums) {
            int max = Integer.MIN_VALUE, imax = 1, imin = 1;
            for (int i = 0; i < nums.length; i++) {
                // 由于存在负数，那么将会导致最大的变最小的，最小的变最大的。
                if (nums[i] < 0) {
                    int tmp = imax;
                    imax = imin;
                    imin = tmp;
                }
                // 当imax为正，nums[i]为负，会更新
                imax = Math.max(imax * nums[i], nums[i]);
                imin = Math.min(imin * nums[i], nums[i]);
                max = Math.max(max, imax);
            }
        return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
