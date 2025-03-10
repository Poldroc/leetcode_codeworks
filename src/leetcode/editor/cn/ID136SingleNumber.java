package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID136SingleNumber{
    public static void main(String[] args) {
        Solution solution = new ID136SingleNumber().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        // 任何数和 0 做异或运算，结果仍然是原来的数，即 a⊕0=a。
        // 任何数和其自身做异或运算，结果是 0，即 a⊕a=0。
        // 异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
