package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID139WordBreak {
    public static void main(String[] args) {
        Solution solution = new ID139WordBreak().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            HashSet<String> wordDicts = new HashSet<>(wordDict);
            // dp[i] 是s的前i个可以由 wordDict 组成
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;
            for (int i = 0; i < s.length()+1; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j]&&wordDicts.contains(s.substring(j,i))){
                        dp[i] = true;
                    }
                }
            }
            return dp[s.length()];

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
