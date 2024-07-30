package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID73SetMatrixZeroes {
    public static void main(String[] args) {
        Solution solution = new ID73SetMatrixZeroes().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void setZeroes(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            int[] rows = new int[row];
            int[] cols = new int[col];
            Arrays.fill(rows, 0);
            Arrays.fill(cols, 0);
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == 0) {
                        rows[i] = 1;
                        cols[j] = 1;
                    }
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (rows[i] == 1 || cols[j] == 1) {
                        matrix[i][j] = 0;
                    }
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
