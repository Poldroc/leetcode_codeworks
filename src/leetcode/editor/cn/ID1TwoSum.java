package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1TwoSum {
    public static void main(String[] args) {
        Solution solution = new ID1TwoSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            if (nums.length < 2) {
                return res;
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int temp = target - nums[i];
                if (map.containsKey(temp)) {
                    res[0] = i;
                    res[1] = map.get(temp);
                    break;
                }
                map.put(nums[i], i);

            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
