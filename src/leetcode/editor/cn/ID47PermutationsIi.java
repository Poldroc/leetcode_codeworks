package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID47PermutationsIi {
    public static void main(String[] args) {
        Solution solution = new ID47PermutationsIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //存放结果
        List<List<Integer>> result = new ArrayList<>();
        //暂存结果
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> permuteUnique(int[] nums) {
            boolean[] used = new boolean[nums.length];
            Arrays.sort(nums);
            backTrack(nums, used);
            return result;
        }

        private void backTrack(int[] nums, boolean[] used) {
            if (path.size() == nums.length) {
                result.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                // used[i - 1] == true，说明同⼀树⽀nums[i - 1]使⽤过
                // used[i - 1] == false，说明同⼀树层nums[i - 1]使⽤过
                // 如果同⼀树层nums[i - 1]使⽤过则直接跳过
                if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                    continue;
                }
                //如果同⼀树⽀nums[i]没使⽤过开始处理
                if (used[i] == false) {
                    used[i] = true;//标记同⼀树⽀nums[i]使⽤过，防止同一树枝重复使用
                    path.add(nums[i]);
                    backTrack(nums, used);
                    path.remove(path.size() - 1);//回溯，说明同⼀树层nums[i]使⽤过，防止下一树层重复
                    used[i] = false;//回溯
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
