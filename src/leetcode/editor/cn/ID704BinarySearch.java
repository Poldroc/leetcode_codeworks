package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID704BinarySearch {
    public static void main(String[] args) {
        Solution solution = new ID704BinarySearch().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + ((right - left) / 2);
                if (target < nums[mid]) {
                    right = mid - 1;
                } else if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
