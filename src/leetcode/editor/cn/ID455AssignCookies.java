package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID455AssignCookies {
    public static void main(String[] args) {
        Solution solution = new ID455AssignCookies().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 优先考虑胃口，先喂饱大胃口
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int count = 0;
            // 饼干开始遍历的下标
            int sIndex = s.length - 1;
            for (int i = g.length - 1; i >= 0; i--) {
                if (sIndex >= 0 && g[i] <= s[sIndex]) {
                    sIndex--;
                    count++;
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
