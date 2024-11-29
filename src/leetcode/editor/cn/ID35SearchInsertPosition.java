package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID35SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new ID35SearchInsertPosition().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int center = left + (right - left) / 2;
                int temp = nums[center];
                if (temp > target) {
                    right = center -1;
                } else if (temp < target) {
                    left = center +1;
                } else {
                    return center;
                }
            }
            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
