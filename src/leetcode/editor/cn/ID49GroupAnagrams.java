package leetcode.editor.cn;

import java.util.*;
import java.util.stream.Collectors;

import leetcode.editor.util.*;

public class ID49GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new ID49GroupAnagrams().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            return new ArrayList<>(Arrays.stream(strs)
                    .collect(
                            Collectors.groupingBy(
                                    s -> {
                                        char[] charArray = s.toCharArray();
                                        Arrays.sort(charArray);
                                        return new String(charArray);
                                    }
                            )
                    ).values());

    }
//leetcode submit region end(Prohibit modification and deletion)

}
