package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1004MaxConsecutiveOnesIii{
    public static void main(String[] args) {
        Solution solution = new ID1004MaxConsecutiveOnesIii().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int cnt0 = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            cnt0 += 1 - nums[right]; // 0 变成 1，用来统计 cnt0
            while (cnt0 > k) {
                cnt0 -= 1 - nums[left++];
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
