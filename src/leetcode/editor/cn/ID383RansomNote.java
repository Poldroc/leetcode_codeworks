package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID383RansomNote {
    public static void main(String[] args) {
        Solution solution = new ID383RansomNote().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.length() > magazine.length()) {
                return false;
            }
            // 定义一个哈希映射数组
            int[] record = new int[26];
            for (char c : magazine.toCharArray()) {
                record[c - 'a'] ++;
            }
            for (char c : ransomNote.toCharArray()){
                record[c-'a']--;
            }
            for (int i : record){
                if (i<0){
                    return false;
                }
            }

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
