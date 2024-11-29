package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID649Dota2Senate {
    public static void main(String[] args) {
        Solution solution = new ID649Dota2Senate().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String predictPartyVictory(String senate) {
            Queue<Integer> ra = new LinkedList<>();
            Queue<Integer> di = new LinkedList<>();
            for (int i = 0; i < senate.length(); i++) {
                if (senate.charAt(i) == 'R') {
                    ra.offer(i);
                } else {
                    di.offer(i);
                }
            }
            while (!ra.isEmpty() && !di.isEmpty()) {
                int r = ra.poll();
                int d = di.poll();
                if (r > d) {
                    di.offer(d + senate.length());
                } else {
                    ra.offer(r + senate.length());
                }
            }
            return ra.isEmpty() ? "Dire" : "Radiant";
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
