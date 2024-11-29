package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID215KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution solution = new ID215KthLargestElementInAnArray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            int[] buckets = new int[20001];
            for (int i = 0; i < nums.length; i++) {
                buckets[nums[i] + 10000]++;
            }
            for (int i = 20000; i >= 0; i--) {
                k-=buckets[i];
                if (k<=0){
                    return i-10000;
                }
            }
            return 0;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
