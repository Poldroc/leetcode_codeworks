package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID59SpiralMatrixIi {
    public static void main(String[] args) {
        Solution solution = new ID59SpiralMatrixIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] generateMatrix(int n) {
            // 控制循环次数
            int loop = 0;
            int[][] res = new int[n][n];
            // 每次循环的开始点(start, start)
            int start = 0;
            // 定义填充数字
            int count = 1;
            // 行，列
            int i, j;

            while (loop++ < n / 2) { // 判断边界后，loop从1开始
                // 模拟上侧从左到右
                for (j = start; j < n - loop; j++) {
                    res[start][j] = count++;
                }

                // 模拟右侧从上到下
                for (i = start; i < n - loop; i++) {
                    res[i][j] = count++;
                }

                // 下侧从右到左
                for (; j >= loop; j--) {
                    res[i][j] = count++;
                }

                // 左侧从下到上
                for (; i >= loop; i--) {
                    res[i][j] = count++;
                }
                start++;
            }

            if (n % 2 == 1) {
                res[start][start] = count;
            }

            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
