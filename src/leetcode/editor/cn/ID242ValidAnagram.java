package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID242ValidAnagram{
	public static void main(String[] args) {
		Solution solution = new ID242ValidAnagram().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
		int[] record = new int[26];
		for (int i = 0; i < s.length(); i++) {
			record[s.charAt(i) - 'a']++;     // 并不需要记住字符a的ASCII，只要求出一个相对数值就可以了
		}
		for (int i = 0; i < t.length(); i++) {
			record[t.charAt(i) - 'a']--;
		}

		for (int count: record) {
			if (count != 0) {               // record数组如果有的元素不为零0，说明字符串s和t 一定是谁多了字符或者谁少了字符。
				return false;
			}
		}
		return true;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
