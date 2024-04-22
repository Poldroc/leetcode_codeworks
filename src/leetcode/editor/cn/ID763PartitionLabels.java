package leetcode.editor.cn;

import java.sql.ClientInfoStatus;
import java.util.*;
import leetcode.editor.util.*;

public class ID763PartitionLabels{
	public static void main(String[] args) {
		Solution solution = new ID763PartitionLabels().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> partitionLabels(String s) {
		int[] remote = new int[26];
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			remote[s.charAt(i)-'a'] = i;
		}
		int idx = 0;
		// 最新分割区内的最后的下标
		int last = -1;
		for (int i = 0; i < s.length(); i++) {
			// 保证当前字母出现的最远下标是当前范围内最远下标
			idx = Math.max(idx,remote[s.charAt(i)-'a']);
			if (idx == i){
				res.add(i-last);
				last = i;
			}
		}
		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
