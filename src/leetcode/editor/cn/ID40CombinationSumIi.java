package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID40CombinationSumIi {
    public static void main(String[] args) {
        Solution solution = new ID40CombinationSumIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        boolean[] used;
        int sum= 0;

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            used = new boolean[candidates.length];
            // 加标志数组，用来辅助判断同层节点是否已经遍历
            Arrays.fill(used, false);
            // 为了将重复的数字都放到一起，所以先进行排序
            Arrays.sort(candidates);
            backtracking(candidates, target, 0);
            return res;
        }

        public void backtracking(int[] candidates, int target, int startIndex) {
            if (sum == target) {
                res.add(new ArrayList<>(path));
                return;
            }

            for (int i = startIndex; i < candidates.length; i++) {
                if (sum + candidates[i] > target) {
                    break;
                }
                // 出现重复节点，同层的第一个节点已经被访问过，所以直接跳过
                if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                sum += candidates[i];
                path.add(candidates[i]);
                backtracking(candidates, target, i + 1);
                used[i] = false;
                sum -= candidates[i];
                path.removeLast();
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
