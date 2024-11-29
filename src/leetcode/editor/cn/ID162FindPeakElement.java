package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID162FindPeakElement {
    public static void main(String[] args) {
        Solution solution = new ID162FindPeakElement().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findPeakElement(int[] nums) {
            // 峰值一定在递增的方向
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < nums[mid+1]){
                    left = mid+1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
