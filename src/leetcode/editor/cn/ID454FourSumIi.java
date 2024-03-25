package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID454FourSumIi {
    public static void main(String[] args) {
        Solution solution = new ID454FourSumIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            int res = 0;
            Map<Integer, Integer> map = new HashMap<>();
            // 统计两个数组中的元素之和(key)，同时统计出现的次数(value)，放入map
            for (int i : nums1) {
                for (int j : nums2) {
                    int sum = i + j;
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }

            for (int i : nums3) {
                for (int j : nums4) {
                    res += map.getOrDefault(-i - j, 0);
                }
            }

            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
