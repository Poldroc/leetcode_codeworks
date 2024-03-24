package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID349IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new ID349IntersectionOfTwoArrays().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int[] hash1 = new int[1002];
            int[] hash2 = new int[1002];
            for (int i : nums1) {
                hash1[i]++;
            }
            for (int i : nums2) {
                hash2[i]++;
            }
            List<Integer> resList = new ArrayList<>();
            for (int i = 0; i < 1002; i++) {
                if (hash1[i] > 0 && hash2[i] > 0) {
                    resList.add(i);
				}
			}
            int index = 0;
            int res[] = new int[resList.size()];
            for (int i : resList) {
				res[index++] = i;
			}
            return res;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
