package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID643MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Solution solution = new ID643MaximumAverageSubarrayI().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
        solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3},4);

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int max = 0,sum = 0;
            for (int i = 0; i < k; i++) {
                sum += nums[i];
            }
            int l = 0, r = k - 1;
            max = sum;
            while (r < nums.length-1){
                r++;
                sum = sum+nums[r]-nums[l];
                max = Math.max(sum,max);
                l++;
            }

            return (double) max / k;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
