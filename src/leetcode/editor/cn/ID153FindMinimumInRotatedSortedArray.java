package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID153FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Solution solution = new ID153FindMinimumInRotatedSortedArray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMin(int[] nums) {
			if (nums.length == 1) return nums[0];
            int left = 1, right = nums.length - 1,min= 0;
			while (left<=right){
				int mid = (left+right)/2;
				if (nums[mid] > nums[0]){
					left = mid+1;
				}else {
					right = mid-1;
					min = mid;
				}
			}
			return nums[min];

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
