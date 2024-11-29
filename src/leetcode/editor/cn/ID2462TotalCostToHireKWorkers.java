package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID2462TotalCostToHireKWorkers {
    public static void main(String[] args) {
        Solution solution = new ID2462TotalCostToHireKWorkers().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public long totalCost(int[] costs, int k, int candidates) {
            int n = costs.length;
            long res = 0;

            if (2 * candidates + k > n) {
                Arrays.sort(costs);
                for (int i = 0; i < k; i++) {
                    res += costs[i];
                }
                return res;
            }
            PriorityQueue<Integer> pre = new PriorityQueue();
            PriorityQueue<Integer> end = new PriorityQueue();
            for (int i = 0; i < candidates; i++) {
                pre.offer(costs[i]);
                end.offer(costs[n - 1 - i]);
            }
            int pi = candidates;
            int ei = n - 1 - candidates;

            for (int i = 0; i < k; i++) {
                if (pre.peek() <= end.peek()) {
                    res += pre.poll();
                    pre.offer(costs[pi++]);
                } else {
                    res += end.poll();
                    end.offer(costs[ei--]);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
