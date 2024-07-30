package leetcode.editor.cn;

import java.lang.reflect.AnnotatedArrayType;
import java.util.*;

import leetcode.editor.util.*;

public class ID56MergeIntervals {
    public static void main(String[] args) {
        Solution solution = new ID56MergeIntervals().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length == 0) {
                return new int[0][2];
            }
            Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
            List<int[]> res = new ArrayList<>();
            for (int i = 0; i < intervals.length; i++) {
                int left = intervals[i][0], right = intervals[i][1];
                if (res.isEmpty() || res.get(res.size() - 1)[1] < left) {
                    res.add(new int[]{left, right});
                } else {
                    res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], right);
                }
            }
            return res.toArray(new int[res.size()][]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
