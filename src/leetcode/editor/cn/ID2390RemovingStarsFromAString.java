package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID2390RemovingStarsFromAString{
    public static void main(String[] args) {
        Solution solution = new ID2390RemovingStarsFromAString().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (char c:s.toCharArray()){
            if (c=='*'){
                res.deleteCharAt(res.length()-1);
            }else {
                res.append(c);
            }
        }
        return res.toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
