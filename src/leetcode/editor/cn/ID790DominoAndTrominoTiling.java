package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID790DominoAndTrominoTiling{
    public static void main(String[] args) {
        Solution solution = new ID790DominoAndTrominoTiling().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTilings(int n) {
        int mod = (int) 1e9 + 7;
        int[][] dp = new int[n + 1][4];
        dp[0][3] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][3];
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % mod;
            dp[i][3] = (((dp[i - 1][0] + dp[i - 1][1]) % mod + dp[i - 1][2]) % mod + dp[i - 1][3]) % mod;
        }
        return dp[n][3];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
