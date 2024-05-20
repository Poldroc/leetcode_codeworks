package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID695MaxAreaOfIsland {
    public static void main(String[] args) {
        Solution solution = new ID695MaxAreaOfIsland().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[][] dir = {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };
        boolean[][] visited;
        int count;

        public int maxAreaOfIsland(int[][] grid) {
            int res = 0;
            visited = new boolean[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (!visited[i][j] && grid[i][j] == 1) {
                        count = 0;
                        dfs(grid, i, j);
                        res = Math.max(res, count);
                    }
                }
            }
            return res;
        }

        private void dfs(int[][] grid, int i, int j) {
            if (grid[i][j] == 0 || visited[i][j]) return;
            visited[i][j] = true;
            count++;
            for (int k = 0; k < 4; k++) {
                int nextI = i + dir[k][0];
                int nextJ = j + dir[k][1];
                if (nextI < 0 || nextJ < 0 || nextI >= grid.length || nextJ >= grid[0].length) continue;
                dfs(grid, nextI, nextJ);
            }
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
