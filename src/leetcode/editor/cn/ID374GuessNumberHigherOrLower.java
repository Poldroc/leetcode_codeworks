package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID374GuessNumberHigherOrLower{
    public static void main(String[] args) {
        Solution solution = new ID374GuessNumberHigherOrLower().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution /*extends GuessGame */{
    public int guessNumber(int n) {
        int left = 1/*, right = n*/;
//        while (left < right) { // 循环直至区间左右端点相同
//            int mid = left + (right - left) / 2; // 防止计算时溢出
//            if (guess(mid) < 0) {
//                right = mid-1; // 答案在区间 [left, mid] 中
//            } else if (guess(mid) > 0){
//                left = mid + 1; // 答案在区间 [mid+1, right] 中
//            } else {
//                return mid;
//            }
//        }
//        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
