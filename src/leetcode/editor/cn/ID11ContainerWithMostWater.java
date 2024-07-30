package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID11ContainerWithMostWater {
    public static void main(String[] args) {
        Solution solution = new ID11ContainerWithMostWater().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxArea(int[] height) {
            int i = 0, j = height.length - 1, res = 0;
            while (i < j) {
                res = height[i] > height[j] ?
                        Math.max(res, (j - i) * height[j--]) :
                        Math.max(res, (j - i) * height[i++]);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
