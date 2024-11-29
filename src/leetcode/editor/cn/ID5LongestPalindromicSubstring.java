package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID5LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new ID5LongestPalindromicSubstring().new Solution();
        StringBuilder sb = new StringBuilder();
        solution.longestPalindrome("babad");


        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            int len = s.length();
            if (len < 2) {
                return s;
            }
            boolean[][] dp = new boolean[len][len];
            for (int i = 0; i < len; i++) {
                dp[i][i] = true;
            }
            int max = 1,begin = 0;
            for (int i = 1; i < len; i++) {
                for (int j = 0; j < i; j++) {
                    if (s.charAt(i) != s.charAt(j)) {
                        dp[j][i] = false;
                    } else {
                        if (i - j < 3) {
                            dp[j][i] = true;
                        } else {
                            dp[j][i] = dp[j + 1][i - 1];
                        }
                    }
                    if (dp[j][i] && max < i - j + 1) {
                        max = i - j + 1;
                        begin = j;
                    }
                }
            }
            return s.substring(begin,begin+max);


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
