package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID75SortColors {
    public static void main(String[] args) {
        Solution solution = new ID75SortColors().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void sortColors(int[] nums) {
            int p1 = 0, p2 = nums.length - 1;
            for (int i = 0; i <= p2; i++) {
                while (i<=p2 && nums[i] == 2){
                    swap(nums,i,p2);
                    p2--;
                }
                if (nums[i] == 0){
                    swap(nums,i,p1);
                    p1++;
                }
            }
        }

        private void swap(int[] nums, int i1, int i2) {
            int temp = nums[i1];
            nums[i1] = nums[i2];
            nums[i2] = temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
