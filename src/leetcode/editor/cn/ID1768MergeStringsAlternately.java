package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1768MergeStringsAlternately{
    public static void main(String[] args) {
        Solution solution = new ID1768MergeStringsAlternately().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int i1=0,i2=0;
        StringBuilder res = new StringBuilder();
        while (i1<l1||i2<l2){
            if (i1<l1){
                res.append(word1.charAt(i1));
                i1++;
            }
            if (i2<l2){
                res.append(word2.charAt(i2));
                i2++;
            }
        }
        return res.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
