package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID860LemonadeChange {
    public static void main(String[] args) {
        Solution solution = new ID860LemonadeChange().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int five = 0;
            int ten = 0;
            for (int i = 0; i < bills.length; i++) {
                if (bills[i] == 5) {
                    five++;
                } else if (bills[i] == 10) {
                    five--;
                    ten++;
                } else if (bills[i] == 20) {
                    if (ten > 0) {
                        ten--;
                        five--;
                    } else {
                        five -= 3;
                    }
                }
                if (five < 0 || ten < 0) return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
