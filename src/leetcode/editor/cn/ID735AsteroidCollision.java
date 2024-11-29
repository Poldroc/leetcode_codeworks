package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID735AsteroidCollision{
    public static void main(String[] args) {
        Solution solution = new ID735AsteroidCollision().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int t:asteroids){
            boolean f = true;
            while (f&&!dq.isEmpty()&&t<0&&dq.peekLast()>0){
                int a = dq.peekLast(),b=-t;
                if (a<=b) dq.pollLast();
                if (a>=b) f=false;
            }
            if (f) dq.addLast(t);
        }
        int size = dq.size();
        int[] res = new int[size];
        for (int i=0;i<size;i++){
            res[i] = dq.pollFirst();
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
