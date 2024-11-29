package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID724FindPivotIndex{
    public static void main(String[] args) {
        Solution solution = new ID724FindPivotIndex().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
