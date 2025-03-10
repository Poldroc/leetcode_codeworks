package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID435NonOverlappingIntervals{
	public static void main(String[] args) {
		Solution solution = new ID435NonOverlappingIntervals().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
		// 按左边排序，不管右边顺序。相交的时候取最小的右边。
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
		int count = 0;
		int right = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] < right) {
				count++;
				// 取最小的右边，减小后续的相交概率，保证右边尽可能小
				right = Math.min(right, intervals[i][1]);
			} else {
				right = intervals[i][1];
			}
		}
		return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
