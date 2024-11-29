package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1679MaxNumberOfKSumPairs{
    public static void main(String[] args) {
        Solution solution = new ID1679MaxNumberOfKSumPairs().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            int c = cnt.getOrDefault(k - x, 0);
            if (c > 0) {
                cnt.put(k - x, c - 1);
                ans++;
            } else {
                cnt.put(x,cnt.getOrDefault(x,0)+1);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
