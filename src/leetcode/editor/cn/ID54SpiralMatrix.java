package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID54SpiralMatrix {
    public static void main(String[] args) {
        Solution solution = new ID54SpiralMatrix().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix.length == 0) {
                return new ArrayList<>();
            }
            ArrayList<Integer> res = new ArrayList<>();
            int l = 0, t = 0, r = matrix[0].length - 1, b = matrix.length - 1;
            while (true) {
                for (int i = l; i <= r; i++) res.add(matrix[t][i]);
                if (++t > b) break;
                for (int i = t; i <= b; i++) res.add(matrix[i][r]); // top to bottom
                if (--r < l) break;
                for (int i = r; i >= l; i--) res.add(matrix[b][i]); // right to left
                if (--b < t) break;
                for (int i = b; i >= t; i--) res.add(matrix[i][l]); // bottom to top
                if (++l > r) break;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
