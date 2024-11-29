package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID933NumberOfRecentCalls {
    public static void main(String[] args) {
        //Solution solution = new ID933NumberOfRecentCalls().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class RecentCounter {
        Queue<Integer> queue;

        public RecentCounter() {
            queue = new ArrayDeque<Integer>();
        }

        public int ping(int t) {
            queue.offer(t);
            while (queue.peek() < t - 3000) {
                queue.poll();
            }
            return queue.size();
        }
    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
