package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1431KidsWithTheGreatestNumberOfCandies{
    public static void main(String[] args) {
        Solution solution = new ID1431KidsWithTheGreatestNumberOfCandies().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> res = new ArrayList<>();
        for (int i : candies){
            if (i+extraCandies >= max){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
