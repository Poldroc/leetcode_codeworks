package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID392IsSubsequence{
	public static void main(String[] args) {
		Solution solution = new ID392IsSubsequence().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
		if (s.length() == 0) return true;
		for (int i = 0, j = 0; j < t.length(); j++) {
			if (s.charAt(i) == t.charAt(j)) {
				// 若已经遍历完 s ，则提前返回 true
				if (++i == s.length())
					return true;
			}
		}
		return false;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
