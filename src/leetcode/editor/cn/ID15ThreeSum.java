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
            int len = nums.length;
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < len - 2 && nums[i] <= 0; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int j = i + 1, k = len - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum > 0) {
                        --k;
                    } else if (sum < 0) {
                        ++j;
                    } else {
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j++], nums[k--])));
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    }
                }

            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
