package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1466ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public static void main(String[] args) {
        Solution solution = new ID1466ReorderRoutesToMakeAllPathsLeadToTheCityZero().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minReorder(int n, int[][] connections) {
            // paths[i] -> List<int[]> 保存点边，表示以i为起点的边的集合
            // int[] 保存两个属性，第一个属性是终点，第二个属性是方向，connections中有的为正向，方向为1
            List<int[]>[] paths = new List[n];
            for (int i = 0; i < n; i++) {
                paths[i] = new ArrayList<int[]>();
            }
            for (int[] edge : connections){
                paths[edge[0]].add(new int[]{edge[1],1});
                paths[edge[1]].add(new int[]{edge[0],0});
            }
            return dfs(0,-1,paths);
        }

        private int dfs(int start,int pre,List<int[]>[] paths){
            int res =0;
            for(int[] path : paths[start]){
                if (path[0] == pre) continue;
                res += path[1] + dfs(path[0],start,paths);
            }
            return res;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
