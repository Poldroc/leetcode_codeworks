package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID238ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution solution = new ID238ProductOfArrayExceptSelf().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] res = new int[nums.length];
            res[0] = 1;
            for (int i = 1; i < nums.length; i++) {
                res[i] = res[i - 1] * nums[i - 1];
            }
            int temp = 1;
            for (int i = nums.length - 2; i >= 0; i--) {
                temp *= nums[i + 1];
                res[i] *= temp;
            }
            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
