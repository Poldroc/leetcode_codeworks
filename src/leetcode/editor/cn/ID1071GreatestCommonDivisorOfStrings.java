package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1071GreatestCommonDivisorOfStrings{
    public static void main(String[] args) {
        Solution solution = new ID1071GreatestCommonDivisorOfStrings().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
