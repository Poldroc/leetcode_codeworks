package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID406QueueReconstructionByHeight {
    public static void main(String[] args) {
        Solution solution = new ID406QueueReconstructionByHeight().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            // 局部最优：优先按身高高的people的k来插入。插入操作过后的people满足队列属性
            //
            // 全局最优：最后都做据插入操作，整个队列满足题目队列属性

            // 身高从大到小排（身高相同k小的站前面）
            Arrays.sort(people, (a, b) -> {
                if (a[0] == b[0]) return a[1] - b[1];   // a - b 是升序排列
                return b[0] - a[0];
            });
            LinkedList<int[]> que = new LinkedList<>();
            for (int[] p : people) {
                // Linkedlist.add(index, value)，會將value插入到指定index裡。如果index相同。原本的会向后移动
                que.add(p[1],p);
            }
            return que.toArray(new int[people.length][]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
