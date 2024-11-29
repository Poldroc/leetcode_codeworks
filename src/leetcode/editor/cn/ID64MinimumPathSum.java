package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID64MinimumPathSum{
    public static void main(String[] args) {
        Solution solution = new ID64MinimumPathSum().new Solution();
        StringBuilder sb = new StringBuilder();
        // 测试用例:[[1,2,3],[4,5,6]]
        solution.minPathSum(new int[][]{{1,2,3},{4,5,6}});

        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1;i<m;i++){
            dp[i][0] = grid[i][0]+dp[i-1][0];
        }
        for (int i =1;i<n;i++){
            dp[0][i] = grid[0][i]+dp[0][i-1];
        }
        for (int i = 1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
