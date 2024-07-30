package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID560SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution solution = new ID560SubarraySumEqualsK().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int res = 0;
            for (int left = 0; left < nums.length; left++) {
                int sum = 0, flag = 1;
                for (int right = left; right < nums.length; right++) {
                    sum += nums[right];
                    if (sum == k) {
                        res++;
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
