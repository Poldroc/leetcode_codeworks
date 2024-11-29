package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1732FindTheHighestAltitude{
    public static void main(String[] args) {
        Solution solution = new ID1732FindTheHighestAltitude().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0, sum = 0;
        for (int x : gain) {
            sum += x;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
