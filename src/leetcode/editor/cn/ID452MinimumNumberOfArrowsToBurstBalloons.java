package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID452MinimumNumberOfArrowsToBurstBalloons{
	public static void main(String[] args) {
		Solution solution = new ID452MinimumNumberOfArrowsToBurstBalloons().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinArrowShots(int[][] points) {
		Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
		int count = 1;
		for (int i = 1; i < points.length; i++) {
			// 气球i左边大于气球i-1的右边,没有重合
			if (points[i][0] > points[i - 1][1]) {
				count++; // 需要一支箭
			} else {
				// 重合
				// 更新重叠气球最小右边界
				points[i][1] = Math.min(points[i][1], points[i - 1][1]);
			}
		}
		return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
