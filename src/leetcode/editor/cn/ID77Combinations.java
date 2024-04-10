package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID77Combinations {
    public static void main(String[] args) {
        Solution solution = new ID77Combinations().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 存放符合条件结果的集合
        List<List<Integer>> result = new ArrayList<>();
        // 用来存放符合条件单一结果
        LinkedList<Integer> path = new LinkedList<>();

        public List<List<Integer>> combine(int n, int k) {
            backtracking(n, k, 1);
            return result;
        }

        public void backtracking(int n, int k, int startIndex) {
            if (path.size() == k) {
                result.add(new ArrayList<>(path));
                return;
            }
            for (int i = startIndex; i <= n; i++) {// 控制树的横向遍历
                // 处理节点
                path.add(i);
                // 递归：控制树的纵向遍历，注意下一层搜索要从i+1开始
                backtracking(n, k, i + 1);
                // 回溯，撤销处理的节点
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
