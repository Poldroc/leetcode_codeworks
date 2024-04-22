package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID509FibonacciNumber {
    public static void main(String[] args) {
        Solution solution = new ID509FibonacciNumber().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fib(int n) {
            if (n <= 1) return n;
            int a = 0, b = 1, c = 0;
            for (int i = 1; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
