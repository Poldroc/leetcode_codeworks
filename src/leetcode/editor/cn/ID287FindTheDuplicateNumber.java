package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID287FindTheDuplicateNumber {
    public static void main(String[] args) {
        Solution solution = new ID287FindTheDuplicateNumber().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findDuplicate(int[] nums) {
            int slow = 0, fast = 0;
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);
            fast = 0;
            while (slow!=fast){
                slow = nums[slow];
                fast = nums[fast];
            }
            return fast;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
