package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID2300SuccessfulPairsOfSpellsAndPotions {
    public static void main(String[] args) {
        Solution solution = new ID2300SuccessfulPairsOfSpellsAndPotions().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int[] res = new int[spells.length];
            int pl = potions.length;
            Arrays.sort(potions);
            for (int i = 0; i < spells.length; i++) {
                int x = spells[i];
                long target = ((success - 1) / x);
                if (target >= potions[pl - 1]) res[i] = 0;
                int left = 0, right = pl - 1;
                int ans = pl;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    int m = potions[mid];
                    if (m > target) {
                        ans = mid;
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                res[i] = pl - ans;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
