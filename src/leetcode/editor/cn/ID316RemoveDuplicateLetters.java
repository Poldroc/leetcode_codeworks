package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID316RemoveDuplicateLetters {
    public static void main(String[] args) {
        Solution solution = new ID316RemoveDuplicateLetters().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeDuplicateLetters(String s) {
            // 字符是否存在在结果中
            boolean[] exits = new boolean[26];
            // 字符在剩下字符串中的个数
            int[] nums = new int[26];
            for (int i = 0; i < s.length(); i++) {
                nums[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                // 只有结果中不存在的字符才可能添加
                if (!exits[c - 'a']) {
                    // 结果顶端的字符大于新字符
                    while (!sb.isEmpty() && sb.charAt(sb.length() - 1) > c) {
                        // 如果剩下字符串中没有顶端的字符，则跳过
                        if (nums[sb.charAt(sb.length() - 1) - 'a'] <= 0) {
                            break;
                        }
                        // 移除顶端
                        exits[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    exits[c - 'a'] = true;
                    sb.append(c);
                }
                nums[c-'a']--;
            }
            return sb.toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
