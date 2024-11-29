package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1926NearestExitFromEntranceInMaze{
    public static void main(String[] args) {
        Solution solution = new ID1926NearestExitFromEntranceInMaze().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int[][] directions = {{0, 1, 0, -1}, {1, 0, -1, 0}};

        //记录已经访问过的点的坐标
        Queue<int[]> queue = new LinkedList<>();
        //将入口加入队列
        queue.offer(new int[] {entrance[0], entrance[1], 0});//最后一位表示当前走了几步
        // 遍历到的坐标变为墙 防止重复遍历
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            int[] curLocal = queue.poll(); // 坐标出队
            int row = curLocal[0]; //坐标行
            int col = curLocal[1]; //坐标列
            for(int i = 0; i < 4; i++){
                int x = row + directions[0][i];
                int y = col + directions[1][i];
                // 新坐标合法 且 不为墙
                if(x >= 0 && x <= m - 1 && y >= 0 && y <= n - 1 && maze[x][y] == '.'){
                    // 新坐标为出口
                    if(x == 0 || x == m - 1 || y == 0 || y == n - 1){
                        return curLocal[2] + 1; // 多迈一步才能走出迷宫
                    }
                    queue.offer(new int[] {x, y, curLocal[2] + 1});
                    maze[x][y] = '+';
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
