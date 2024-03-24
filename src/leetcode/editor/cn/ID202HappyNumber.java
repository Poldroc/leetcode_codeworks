package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID202HappyNumber {
    public static void main(String[] args) {
        Solution solution = new ID202HappyNumber().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> record = new HashSet<>();
            while (n != 1 && !record.contains(n)) {
                record.add(n);
                n = getNextNumber(n);
            }
            return n == 1;
        }

        private int getNextNumber(int n) {
            int res = 0;
            while (n > 0) {
                int temp = n % 10;
                res += temp * temp;
                n /= 10;
            }
            return res;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
