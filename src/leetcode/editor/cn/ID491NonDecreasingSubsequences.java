package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID491NonDecreasingSubsequences {
    public static void main(String[] args) {
        Solution solution = new ID491NonDecreasingSubsequences().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> findSubsequences(int[] nums) {
            backTracking(nums, 0);
            return result;
        }

        private void backTracking(int[] nums, int startIndex) {
            if (path.size() >= 2) {
                result.add(new ArrayList<>(path));
            }
            // 只负责本层
            HashSet<Integer> hs = new HashSet<>();
            for (int i = startIndex; i < nums.length; i++) {
                if (!path.isEmpty() && path.get(path.size() - 1) > nums[i]
                        || hs.contains(nums[i])) {//本层元素是否重复使用
                    continue;
                }
                hs.add(nums[i]);
                path.add(nums[i]);
                backTracking(nums, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
