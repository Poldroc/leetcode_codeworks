package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID901OnlineStockSpan{
    public static void main(String[] args) {
        Solution solution = new ID901OnlineStockSpan().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class StockSpanner {
        Deque<int[]> deque;

    public StockSpanner() {
        deque = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        while (!deque.isEmpty() && deque.peek()[0] <= price) {
            // 价格小于等于当前价格的元素出栈
            span += deque.pop()[1];
        }
        // 当前价格入栈，以及当前价格的跨度，因为price挡在后面的元素前面，所以不用管之前的元素，只需要记录当前元素的跨度
        deque.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
