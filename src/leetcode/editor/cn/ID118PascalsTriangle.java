package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID118PascalsTriangle{
    public static void main(String[] args) {
        Solution solution = new ID118PascalsTriangle().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0;j<= i;j++){
                if (j==0||j==i){
                    row.add(1);
                } else {
                    row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(row);
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
