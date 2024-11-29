package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID373FindKPairsWithSmallestSums {
    public static void main(String[] args) {
        Solution solution = new ID373FindKPairsWithSmallestSums().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            PriorityQueue<int[]> queue = new PriorityQueue<>(
                    (p1, p2) -> nums1[p1[0]] + nums2[p1[1]] - nums1[p2[0]] - nums2[p2[1]]
            );
            int l1 = nums1.length;
            int l2 = nums2.length;
            for (int i = 0; i < Math.min(l1, k); i++) {
                queue.offer(new int[]{i, 0});
            }
            List<List<Integer>> res = new ArrayList<>();
            while (k-- > 0 && !queue.isEmpty()) {
                int[] poll = queue.poll();
                List<Integer> temp = new ArrayList<>();
                temp.add(nums1[poll[0]]);
                temp.add(nums2[poll[1]]);
                res.add(temp);
                if (poll[1] + 1 < l2) {
                    queue.add(new int[]{poll[0], poll[1]+1});
                }
            }
            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
