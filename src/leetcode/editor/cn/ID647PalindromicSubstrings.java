package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID647PalindromicSubstrings {
    public static void main(String[] args) {
        Solution solution = new ID647PalindromicSubstrings().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSubstrings(String s) {
            // 布尔类型的dp[i][j]：表示区间范围[i,j] （注意是左闭右闭）的子串是否是回文子串，如果是dp[i][j]为true，否则为false。
            char[] charArray = s.toCharArray();
            int len = charArray.length;
            boolean[][] dp = new boolean[len][len];
            int result = 0;
            /**
             * 情况一：下标i 与 j相同，同一个字符例如a，当然是回文子串
             * 情况二：下标i 与 j相差为1，例如aa，也是回文子串
             * 情况三：下标：i 与 j相差大于1的时候，例如cabac，此时s[i]与s[j]已经相同了，我们看i到j区间是不是回文子串就看aba是不是回文就可以了，那么aba的区间就是 i+1 与 j-1区间，这个区间是不是回文就看dp[i + 1][j - 1]是否为true。
             */
            for (int i = len - 1; i >= 0; i--) {
                for (int j = i; j < len; j++) {
                    if (charArray[i] == charArray[j]) {
                        if (j - i <= 1) {
                            result++;
                            dp[i][j] = true;
                        } else if (dp[i + 1][j - 1]) { //情况三
                            result++;
                            dp[i][j] = true;
                        }
                    }

                }

            }
			return result;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
