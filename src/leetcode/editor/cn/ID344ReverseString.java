package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID344ReverseString{
	public static void main(String[] args) {
		Solution solution = new ID344ReverseString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void reverseString(char[] s) {
		int l = 0;
		int r = s.length - 1;
		while(l < r){
			char temp = s[l];
			s[l++] = s[r];
			s[r--] = temp;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
