package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID200NumberOfIslands {
    public static void main(String[] args) {
        Solution solution = new ID200NumberOfIslands().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numIslands(char[][] grid) {
            int res = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        dfs(grid, i, j);
                        res++;
                    }
                }
            }
            return res;
        }

        private void dfs(char[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
            grid[i][j] = '0';
            dfs(grid,i+1,j);
            dfs(grid,i,j+1);
            dfs(grid,i-1,j);
            dfs(grid,i,j-1);

        }
        private void bfs(char[][] grid, int i, int j) {
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{i,j});
            while (!queue.isEmpty()){
                int[] remove = queue.remove();
                i = remove[0];j = remove[1];
                if(0 <= i && i < grid.length && 0 <= j && j < grid[0].length && grid[i][j] == '1') {
                    grid[i][j] = '0';
                    queue.add(new int[] { i + 1, j });
                    queue.add(new int[] { i - 1, j });
                    queue.add(new int[] { i, j + 1 });
                    queue.add(new int[] { i, j - 1 });
                }
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
