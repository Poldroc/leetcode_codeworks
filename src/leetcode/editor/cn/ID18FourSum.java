package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID18FourSum {
    public static void main(String[] args) {
        Solution solution = new ID18FourSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0 && nums[i] > target) {
                    return result;
                }

                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                for (int j = i + 1; j < nums.length; j++) {

                    if (j > i + 1 && nums[j - 1] == nums[j]) {  // 对nums[j]去重
                        continue;
                    }

                    int left = j + 1;
                    int right = nums.length - 1;

                    while (left < right) {
                        long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum > target) {
                            while (left < right && nums[right] == nums[--right]) ;
                        } else if (sum < target) {
                            while (left < right && nums[left] == nums[++left]) ;
                        } else {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            while (left < right && nums[left] == nums[++left]) ;
                            while (left < right && nums[right] == nums[--right]) ;
                        }
                    }
                }

            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
