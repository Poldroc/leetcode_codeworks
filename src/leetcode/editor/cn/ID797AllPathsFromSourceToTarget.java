package leetcode.editor.cn;

import java.net.InetSocketAddress;
import java.util.*;

import leetcode.editor.util.*;

public class ID797AllPathsFromSourceToTarget {
    public static void main(String[] args) {
        Solution solution = new ID797AllPathsFromSourceToTarget().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans; // 存放满足条件的路径
        List<Integer> cnt;  // 保存dfs过程中的节点值

        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
			ans = new ArrayList<>();
			cnt = new ArrayList<>();
			cnt.add(0);			// 注意，0 号节点要加入 cnt 数组中
			dfs(graph, 0);
			return ans;
		}

		public void dfs(int[][] graph, int node) {
			if (node == graph.length - 1) {		// 如果当前节点是 n - 1，那么就保存这条路径
				ans.add(new ArrayList<>(cnt));
				return;
			}
			for (int index  = 0; index < graph[node].length; index ++) {
				int nextNode = graph[node][index];
				cnt.add(nextNode);
				dfs(graph,nextNode);
				cnt.remove(cnt.size()-1);
			}
		}
    }
//leetcode submit region end(Prohibit modification and deletion)

}
