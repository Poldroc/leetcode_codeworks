package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1047RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        Solution solution = new ID1047RemoveAllAdjacentDuplicatesInString().new Solution();
        StringBuilder sb = new StringBuilder();
        solution.removeDuplicates("abbaca");

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String removeDuplicates(String s) {
            Deque<Character> ch = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (ch.isEmpty() || ch.peek() != c) {
                    ch.push(c);
                } else {
                    ch.pop();
                }
            }

            StringBuilder res = new StringBuilder();
            for (char c : ch) {
                res.append(c);
            }

            return new String(res.reverse());

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
