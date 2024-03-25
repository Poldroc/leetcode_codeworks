package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID15ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ID15ThreeSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
// https://leetcode.cn/problems/3sum/solutions/11525/3sumpai-xu-shuang-zhi-zhen-yi-dong-by-jyd/
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int k = 0; k < nums.length - 2; k++) {
                if (nums[k] > 0) {
                    break;
                }
                // 去重
                if (k > 0 && nums[k] == nums[k - 1]) {
                    continue;
                }
                int left = k + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[k] + nums[left] + nums[right];
                    if (sum < 0) {
                        // 去重并且左指针右移
                        while (left < right && nums[left] == nums[++left]) ;
                    } else if (sum > 0) {
                        while (left < right && nums[right] == nums[--right]) ;
                    } else {
                        res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[left], nums[right])));
                        while (left < right && nums[left] == nums[++left]) ;
                        while (left < right && nums[right] == nums[--right]) ;
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
