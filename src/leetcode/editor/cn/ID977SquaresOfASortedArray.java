package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID977SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution solution = new ID977SquaresOfASortedArray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int i = 0, j = nums.length - 1, k = nums.length - 1;
            int[] result = new int[nums.length];
            while (k >= 0) {
                int left = nums[i] * nums[i];
                int right = nums[j] * nums[j];
                if (left <= right) {
                    result[k--] = right;
                    j--;
                } else {
                    result[k--] = left;
                    i++;
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
