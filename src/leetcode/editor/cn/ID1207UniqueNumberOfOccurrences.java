package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1207UniqueNumberOfOccurrences{
    public static void main(String[] args) {
        Solution solution = new ID1207UniqueNumberOfOccurrences().new Solution();
        StringBuilder sb = new StringBuilder();
        
        //执行测试
        
        System.out.println(sb);        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
        for (int x : arr) {
            occur.put(x, occur.getOrDefault(x, 0) + 1);
        }
        Set<Integer> times = new HashSet<Integer>();
        for (Map.Entry<Integer, Integer> x : occur.entrySet()) {
            times.add(x.getValue());
        }
        return times.size() == occur.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
