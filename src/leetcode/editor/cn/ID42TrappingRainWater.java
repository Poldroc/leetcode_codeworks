package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID42TrappingRainWater {
    public static void main(String[] args) {
        Solution solution = new ID42TrappingRainWater().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trap(int[] height) {
            int size = height.length;
            if (size <= 2) {
                return 0;
            }
            int[] maxLeft = new int[size];
            int[] maxRight = new int[size];
            // 记录每个柱子左边和右边最大高度
            maxLeft[0] = height[0];
            for (int i = 1; i < height.length; i++) {
                maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
            }
            maxRight[size - 1] = height[size - 1];
            for (int i = size - 2; i >= 0; i--) {
                maxRight[i] = Math.max(height[i], maxRight[i + 1]);
            }
			int sum = 0;
            for (int i = 0; i < size; i++) {
                int count = Math.min(maxRight[i],maxLeft[i]) - height[i];
                if (count>0) sum+=count;
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
