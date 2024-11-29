package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID334IncreasingTripletSubsequence {
    public static void main(String[] args) {
        Solution solution = new ID334IncreasingTripletSubsequence().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean increasingTriplet(int[] nums) {
            int small = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
            int len = nums.length;
            if (len < 3) return false;
            for (int num : nums) {
                if (num > mid) {
                    return true;
                } else if (num <= small) {
                    small = num;
                } else {
                    mid = num;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
