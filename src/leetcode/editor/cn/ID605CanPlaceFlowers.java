package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID605CanPlaceFlowers{
    public static void main(String[] args) {
        Solution solution = new ID605CanPlaceFlowers().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        for (int i = 0; i < m; i++) {
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == m - 1 || flowerbed[i + 1] == 0)) {
                n--;
                i++; // 下一个位置肯定不能种花，直接跳过
            }
        }
        return n <= 0;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
