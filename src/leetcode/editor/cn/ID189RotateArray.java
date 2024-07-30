package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID189RotateArray {
    public static void main(String[] args) {
        Solution solution = new ID189RotateArray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[] nums, int k) {
            int length = nums.length;
            int[] temp = new int[length];
            for (int i = 0; i < length; i++) {
                temp[(i + k) % length] = nums[i];
            }
            System.arraycopy(temp, 0, nums, 0, length);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
