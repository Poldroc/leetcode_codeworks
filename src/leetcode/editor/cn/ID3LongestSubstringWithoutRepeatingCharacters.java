package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID3LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new ID3LongestSubstringWithoutRepeatingCharacters().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int res = 0, i = 0;
            int[] map = new int[128];
            char[] charArray = s.toCharArray();
            Arrays.fill(map, 0);
            for (int j = 0; j < charArray.length; j++) {
                if (map[charArray[j]] != 0) {
                    i = Math.max(i, map[charArray[j]]);
                }
                map[charArray[j]] = j + 1;
                res = Math.max(res, j - i + 1);
            }
            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
