package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID134GasStation {
    public static void main(String[] args) {
        Solution solution = new ID134GasStation().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int curSum = 0;
            int totalSum = 0;
            int index = 0;
            for (int i = 0; i < gas.length; i++) {
                curSum += gas[i] - cost[i];
                totalSum += gas[i] - cost[i];
                // 一旦curSum小于零，说明[0, i]区间都不能作为起始位置，
                // 因为这个区间选择任何一个位置作为起点，到i这里都会断油
                if (curSum <= 0) {
                    // 那么起始位置从i+1算起，再从0计算curSum
                    index = (i + 1) % gas.length;
                    curSum = 0;
                }
            }
            // 总油量减去总消耗小于0 一定不能跑完
            if (totalSum < 0) return -1;
            return index;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
