package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID22GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new ID22GenerateParentheses().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> res = new ArrayList<>();

        public List<String> generateParenthesis(int n) {

            if (n <= 0) {
                return res;
            }
            func("", n, n);
            return res;

        }

        private void func(String s, int l, int r) {
            if (r == 0 && l == 0) {
                res.add(s);
				return;
            }
            if (r == l) {
				func(s+"(",l-1,r);
            } else if (l<r){
				if (l>0){
					func(s+"(",l-1,r);
				}
				func(s+")",l,r-1);
			}
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
