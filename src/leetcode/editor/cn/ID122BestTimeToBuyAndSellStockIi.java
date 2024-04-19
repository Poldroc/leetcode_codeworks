package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID122BestTimeToBuyAndSellStockIi{
	public static void main(String[] args) {
		Solution solution = new ID122BestTimeToBuyAndSellStockIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
		int result = 0;
		for (int i = 1; i < prices.length; i++) {
			result+=Math.max(prices[i]-prices[i-1],0);
		}
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
