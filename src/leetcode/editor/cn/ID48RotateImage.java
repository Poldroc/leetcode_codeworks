package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID48RotateImage {
    public static void main(String[] args) {
        Solution solution = new ID48RotateImage().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                for (int j = 0; j < n/ 2; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                    matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = tmp;
                }
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
