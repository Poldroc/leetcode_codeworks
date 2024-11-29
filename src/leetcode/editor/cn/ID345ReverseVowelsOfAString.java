package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID345ReverseVowelsOfAString{
    public static void main(String[] args) {
        Solution solution = new ID345ReverseVowelsOfAString().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        int l= 0,r = s.length()-1;
        char[] chars = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        while (l < r) {
            // 从左向右找元音字母
            while (l < s.length() && !vowels.contains(chars[l]))
                l++;
            // 从右向左找元音字母
            while (r >= 0 && !vowels.contains(chars[r]))
                r--;

            // 双指针相遇，退出
            if (l >= r) break;

            // 交换
            char temp = chars[l];
            chars[l++] = chars[r];
            chars[r--] = temp;
        }

        return new String(chars);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
