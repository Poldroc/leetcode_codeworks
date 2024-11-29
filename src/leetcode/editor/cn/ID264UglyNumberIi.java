package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID264UglyNumberIi {
    public static void main(String[] args) {
        Solution solution = new ID264UglyNumberIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int nthUglyNumber(int n) {
            int[] factor = {2, 3, 5};
            Set<Long> set = new HashSet<>();
            PriorityQueue<Long> queue = new PriorityQueue<>();
            set.add(1l);
            queue.offer(1l);
            long ugly = 0;
            while (n-- > 0) {
                Long poll = queue.poll();
                ugly = poll;
                for (int i = 0; i < 3; i++) {
                    if (set.add(poll * factor[i])) {
                        queue.offer(poll * factor[i]);
                    }
                }
            }
            return (int) ugly;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
