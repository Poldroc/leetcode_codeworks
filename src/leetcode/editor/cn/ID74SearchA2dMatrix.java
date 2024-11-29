package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID74SearchA2dMatrix {
    public static void main(String[] args) {
        Solution solution = new ID74SearchA2dMatrix().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix[0].length - 1;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][n] == target) return true;
                if (matrix[i][n] > target) {
                    int left = 0, right = n;
                    while (left <= right) {
                        int mid = (left + right) / 2;
                        if (matrix[i][mid] > target) {
                            right = mid - 1;
                        } else if (matrix[i][mid] < target) {
                            left = mid + 1;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
