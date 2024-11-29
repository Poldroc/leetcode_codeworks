package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID875KokoEatingBananas{
    public static void main(String[] args) {
        Solution solution = new ID875KokoEatingBananas().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1, right = piles[piles.length - 1];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    private boolean canFinish(int[] piles, int speed, int h) {
        int time = 0;
        for (int pile : piles) {
            time += pile % speed == 0 ? pile / speed : pile / speed + 1;;
        }
        return time <= h;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
