package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID283MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new ID283MoveZeroes().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            if (nums.length <= 1) return;
            int j = 0;
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (nums[i] != 0) {
                    nums[j++] = nums[i];
                }
            }
            for (int i = j; i < len; i++) {
                nums[i] = 0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
