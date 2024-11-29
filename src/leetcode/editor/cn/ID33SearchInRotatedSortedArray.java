package leetcode.editor.cn;

import java.net.HttpURLConnection;
import java.util.*;

import leetcode.editor.util.*;

public class ID33SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Solution solution = new ID33SearchInRotatedSortedArray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int min = 0, n = nums.length, left = 1, right = n - 1;
            while (left <= right) {
                int m = (left + right) / 2;
                if (nums[0] < nums[m]) {
                    left = m + 1;
                } else {
                    right = m - 1;
                    min = m;
                }
            }

            if (target > nums[n - 1]) {
                left = 0;
                right = min;
            } else if (target < nums[n - 1]) {
                left = min;
                right = n - 2;
            } else {
                return n - 1;
            }

            while (left <= right){
                int mid = (left+right)/2;
                if (target > nums[mid]){
                    left = mid +1;
                } else if (target < nums[mid]) {
                    right = mid -1;
                } else {
                    return mid;
                }
            }
            return -1;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
