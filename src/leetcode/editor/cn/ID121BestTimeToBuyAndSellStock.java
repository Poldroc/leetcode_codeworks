package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID121BestTimeToBuyAndSellStock{
	public static void main(String[] args) {
		Solution solution = new ID121BestTimeToBuyAndSellStock().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
		int low = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < prices.length; i++) {
			low = Math.min(low,prices[i]);
			result = Math.max(result,prices[i]-low);
		}
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
