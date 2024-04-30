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
            // dp[i] : 字符串长度为i的话，dp[i]为true，表示可以拆分为一个或多个在字典中出现的单词。
            HashSet<String> strings = new HashSet<>(wordDict);
            boolean[] booleans = new boolean[s.length() + 1];
            booleans[0] = true;

            for (int i = 1; i < s.length() + 1; i++) {
				for (int j = 0; j < i; j++) {
					if (booleans[j]&&strings.contains(s.substring(j,i))){
						booleans[i]=true;
					}
				}
            }
			return booleans[s.length()];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
