package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID39CombinationSum {
    public static void main(String[] args) {
        Solution solution = new ID39CombinationSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int sum;

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            sum = 0;
            backtracking(candidates, target, 0);
            return res;
        }

        public void backtracking(int[] candidates, int target, int startIndex) {
            if (sum > target) {
                return;
            }
            if (sum == target) {
                res.add(new ArrayList<>(path));
                return;
            }

            for (int i = startIndex; i < candidates.length; i++) {
                sum += candidates[i];
                path.add(candidates[i]);
                backtracking(candidates, target, i);
                sum -= candidates[i];
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
