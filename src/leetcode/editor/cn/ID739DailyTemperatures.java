package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID739DailyTemperatures{
	public static void main(String[] args) {
		Solution solution = new ID739DailyTemperatures().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
		int length = temperatures.length;
		int[] res= new int[length];
		Deque<Integer> stack = new LinkedList<>();
		for (int i = 0; i < length; i++) {
			while (!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
				res[stack.peek()] = i-stack.peek();
				stack.pop();
			}
			stack.push(i);
		}
		return res;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
