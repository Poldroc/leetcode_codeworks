package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID2215FindTheDifferenceOfTwoArrays{
    public static void main(String[] args) {
        Solution solution = new ID2215FindTheDifferenceOfTwoArrays().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set1.remove(n);
        }
        for (int n : nums1) {
            set2.remove(n);
        }

        return List.of(List.copyOf(set1), List.copyOf(set2));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
