package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID402RemoveKDigits {
    public static void main(String[] args) {
        Solution solution = new ID402RemoveKDigits().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeKdigits(String num, int k) {
            // 栈，用于保存处理后的数字
            Deque<Character> stack = new LinkedList<>();
            int remain = num.length() - k; // 保留的数字个数

            for (char digit : num.toCharArray()) {
                // 当需要移除的次数 k > 0，并且栈顶元素大于当前数字时，移除栈顶元素
                while (k > 0 && !stack.isEmpty() && stack.peekLast() > digit) {
                    stack.pollLast();
                    k--;
                }
                stack.offerLast(digit);
            }

            // 将栈中前 remain 个元素构造为结果字符串
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < remain; i++) {
                result.append(stack.pollFirst());
            }

            // 去掉前导零
            String finalResult = result.toString().replaceFirst("^0+", "");
            return finalResult.isEmpty() ? "0" : finalResult;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
