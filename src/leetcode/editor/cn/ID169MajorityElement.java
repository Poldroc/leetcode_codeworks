package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID169MajorityElement {
    public static void main(String[] args) {
        Solution solution = new ID169MajorityElement().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            Integer candidate = null;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }
            return candidate;
        }

        private void quickSort(int[] nums, int low, int high) {
            if (low < high) {
                int pi = partition(nums, low, high);
                quickSort(nums, low, pi - 1);
                quickSort(nums, pi + 1, high);
            }
        }

        private int partition(int[] nums, int low, int high) {
            int pivot = nums[high];
            // 表示较小元素的最后位置
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (nums[j] <= pivot) {
                    i++;
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

            int temp = nums[i + 1];
            nums[i + 1] = nums[high];
            nums[high] = temp;
            return i + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
