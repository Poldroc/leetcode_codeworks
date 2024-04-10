package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID17LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new ID17LetterCombinationsOfAPhoneNumber().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> result = new ArrayList<>();
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.length() == 0) {
                return result;
            }
            backTracking(digits, 0);
            return result;
        }

        StringBuilder temp = new StringBuilder();

        public void backTracking(String digits, int num) {
            // 遍历全部一次记录一次得到的字符串
            if (num == digits.length()) {
                result.add(temp.toString());
                return;
            }
            String str = numString[digits.charAt(num) - '0'];
            for (int i = 0; i < str.length(); i++) {
                temp.append(str.charAt(i));
                //c
                backTracking(digits, num + 1);
                //剔除末尾的继续尝试
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
