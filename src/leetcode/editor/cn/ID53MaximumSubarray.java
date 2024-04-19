package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID53MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new ID53MaximumSubarray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            int sum = Integer.MIN_VALUE;
            int temp = 0;

            for (int i = 0; i < nums.length; i++) {
                temp += nums[i];
                if (temp > sum) {
                    sum = temp;
                }
                if (temp <= 0) {
                    temp = 0;
                }
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
