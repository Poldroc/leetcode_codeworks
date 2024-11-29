package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID394DecodeString {
    public static void main(String[] args) {
        Solution solution = new ID394DecodeString().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String decodeString(String s) {
            StringBuilder res = new StringBuilder();
            int multi = 0;
            LinkedList<Integer> stackMulti = new LinkedList<>();
            LinkedList<String> stackRes = new LinkedList<>();
            for (Character c : s.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    multi = multi * 10 + Integer.parseInt(c + "");
                } else if (c == '[') {
                    stackMulti.addLast(multi);
                    stackRes.addLast(res.toString());
                    multi = 0;
                    res = new StringBuilder();
                } else if (c == ']') {
                    StringBuilder temp = new StringBuilder();
                    Integer curMulti = stackMulti.removeLast();
                    for (int i = 0; i < curMulti; i++) temp.append(res);
                    res = new StringBuilder(stackRes.removeLast() + temp);
                } else {
                    res.append(c);
                }
            }
            return res.toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
