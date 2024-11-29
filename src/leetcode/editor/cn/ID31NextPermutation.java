package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID31NextPermutation {
    public static void main(String[] args) {
        Solution solution = new ID31NextPermutation().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void nextPermutation(int[] nums) {
            int len = nums.length;
            int i = len - 2, j = len - 1,k = len -1;
            // 从后往前，找到一个相对小的数 i ，第一个递减的数
            while (i>=0&&nums[i]>=nums[j]){
                i--;
                j--;
            }
            // 找到第一个递减的数后面比它大的最小的数，
            // 因为第一个递减的数后面的数都是从后往前递增，
            // 所以从后往前第一个比它大的数就是最小的数
            if (i>=0){
                while (nums[i]>=nums[k]){
                    k--;
                }
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            }
            // 如果i<0 说明数组是递减的，就直接翻转成递增
            // 保证对换后的i之后是递增的，直接翻转i之后
            for (i = j,j = len -1;i<j;i++,j--){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
