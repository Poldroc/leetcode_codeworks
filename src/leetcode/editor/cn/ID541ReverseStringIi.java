package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID541ReverseStringIi {
    public static void main(String[] args) {
        Solution solution = new ID541ReverseStringIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseStr(String s, int k) {
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i += 2 * k) {
                int start = i;
                int end = Math.min(arr.length-1,start+k-1);
                while (start<end){
                    char temp = arr[start];
                    arr[start++]=arr[end];
                    arr[end--]=temp;
                }

            }
            return new String(arr);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
