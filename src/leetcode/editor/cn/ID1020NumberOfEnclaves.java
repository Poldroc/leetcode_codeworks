package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1020NumberOfEnclaves {
    public static void main(String[] args) {
        Solution solution = new ID1020NumberOfEnclaves().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int count = 0;
        int[][] dir = {
                {0, 1},
                {1, 0},
                {-1, 0},
                {0, -1}
        };

        public void dfs(int[][] grid, int i, int j) {
            if (grid[i][j] == 0) return;
            grid[i][j] = 0;
            count++;
            for (int k = 0; k < 4; k++) {
                int nextI = i + dir[k][0];
                int nextJ = j + dir[k][1];
                if (nextI < 0 || nextJ < 0 || nextI >= grid.length || nextJ >= grid[0].length)
                    continue;
                dfs(grid, nextI, nextJ);
            }
        }

        public int numEnclaves(int[][] grid) {
            // 与边相连的区域置0
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][0] == 1)
                    dfs(grid, i, 0);
                if (grid[i][grid[0].length - 1] == 1)
                    dfs(grid, i, grid[0].length - 1);
            }
            //初始化的時候，j 的上下限有調整過，必免重複操作。
            for (int j = 1; j < grid[0].length - 1; j++) {
                if (grid[0][j] == 1)
                    dfs(grid, 0, j);
                if (grid[grid.length - 1][j] == 1)
                    dfs(grid, grid.length - 1, j);
            }
            count = 0;

            // 中间1区域计数
            for (int i = 1; i < grid.length - 1; i++) {
                for (int j = 1; j < grid[0].length - 1; j++) {
                    if (grid[i][j] == 1)
                        dfs(grid, i, j);
                }
            }
            return count;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
