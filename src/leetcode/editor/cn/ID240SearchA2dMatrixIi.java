package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID240SearchA2dMatrixIi {
    public static void main(String[] args) {
        Solution solution = new ID240SearchA2dMatrixIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int i = matrix.length - 1, j = 0;
            while (i >= 0 && j < matrix[0].length) {
                // 当矩阵左下角的值大于目标，则消去该行
                if (matrix[i][j] > target) {
                    i--;
                    // 消去列
                } else if (matrix[i][j] < target) {
                    j++;
                } else {
                    return true;
                }
            }
            return false;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
