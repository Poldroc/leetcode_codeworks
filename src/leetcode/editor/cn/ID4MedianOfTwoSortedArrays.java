package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID4MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new ID4MedianOfTwoSortedArrays().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length, n = nums2.length, len = m + n, left = 0, right = 0, a = 0, b = 0;
            for (int i = 0; i < len / 2 + 1; i++) {
                left = right;
                if (a < m && (b >= n || nums1[a] < nums2[b])) {
                    right = nums1[a++];
                } else {
                    right = nums2[b++];
                }
            }
            if ((len & 1) == 0) {
                return (left + right) / 2.0;
            } else {
                return right;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
