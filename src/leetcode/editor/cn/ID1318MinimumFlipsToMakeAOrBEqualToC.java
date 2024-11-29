package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1318MinimumFlipsToMakeAOrBEqualToC{
    public static void main(String[] args) {
        Solution solution = new ID1318MinimumFlipsToMakeAOrBEqualToC().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minFlips(int a, int b, int c) {
        int res = 0;
        for (int i= 0;i<31;i++){
            int biteA = (a>>i)&1;
            int biteB = (b>>i)&1;
            int biteC = (c>>i)&1;
            if (biteC==0) {
                res+=biteA+biteB;
            }else {
                res+=(biteA+biteB==0)?1:0;
            }
        }
        return res;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
