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
            if (intervals.length == 1) {
                return intervals;
            }
            List<int[]> res = new ArrayList<>();

            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            int left = intervals[0][0], right = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if (right >= intervals[i][0]) {
					if ( right >= intervals[i][1]){
						continue;
					}
					right = intervals[i][1];
                } else {
                    res.add(new int[]{left, right});
                    left = intervals[i][0];
                    right = intervals[i][1];
                }
            }
			res.add(new int[]{left, right});
            return res.toArray(new int[res.size()][]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
