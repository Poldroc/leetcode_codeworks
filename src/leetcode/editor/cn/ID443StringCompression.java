package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID443StringCompression {
    public static void main(String[] args) {
        Solution solution = new ID443StringCompression().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int compress(char[] chars) {
            int write = 0, left = 0;
            int len = chars.length;
            for (int read = 0; read < len; read++) {
                if (read == len - 1 || (chars[read] != chars[read + 1])){
                    chars[write++] = chars[read];
                    int num = read - left + 1;
                    left = read +1;
                    if (num > 1) {
                        int anchor = write;
                        while (num > 0) {
                            chars[write++] = (char) (num % 10 + '0');
                            num /= 10;
                        }
                        reverse(chars, anchor, write - 1);
                    }
                }

            }
            return write;
        }
        private void reverse(char[] chars,int left,int right){
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
