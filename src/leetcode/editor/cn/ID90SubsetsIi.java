package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID90SubsetsIi {
    public static void main(String[] args) {
        Solution solution = new ID90SubsetsIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
        LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
        boolean[] used;

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            if (nums.length == 0) {
                result.add(path);
                return result;
            }
            Arrays.sort(nums);
            used = new boolean[nums.length];
            subsetsWithDupHelper(nums, 0);
            return result;
        }

        private void subsetsWithDupHelper(int[] nums, int startIndex) {
            result.add(new ArrayList<>(path));
            if (startIndex >= nums.length) {
                return;
            }
            for (int i = startIndex; i < nums.length; i++) {
				// 而我们要对同一树层使用过的元素进行跳过
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
				path.add(nums[i]);
				used[i] = true;
				subsetsWithDupHelper(nums, i + 1);
				path.removeLast();
				used[i] = false;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
