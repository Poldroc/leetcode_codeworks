package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID2542MaximumSubsequenceScore {
    public static void main(String[] args) {
        Solution solution = new ID2542MaximumSubsequenceScore().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public long maxScore(int[] nums1, int[] nums2, int k) {
            // 根据nums2降序排序索引i
            int length = nums2.length;
            Integer[] ids = new Integer[length];
            for (int i = 0; i < length; i++) {
                ids[i] = i;
            }
            Arrays.sort(ids, (i, j) -> nums2[j] - nums2[i]);
            // 小顶堆存 num1的sum
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            long sum = 0;
            for (int i = 0; i < k; i++) {
                sum += nums1[ids[i]];
                queue.offer(nums1[ids[i]]);
            }
            long res = sum * nums2[ids[k - 1]];
            for (int i = k; i < length; i++) {
                int x = nums1[ids[i]];
                if (x > queue.peek()) {
                    sum = sum - queue.poll() + x;
                    queue.offer(x);
                    res = Math.max(res, sum * nums2[ids[i]]);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
