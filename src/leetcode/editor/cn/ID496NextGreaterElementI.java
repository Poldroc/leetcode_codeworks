package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID496NextGreaterElementI{
	public static void main(String[] args) {
		Solution solution = new ID496NextGreaterElementI().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			map.put(nums1[i],i);
		}
		int[] res = new int[nums1.length];
		Arrays.fill(res,-1);
		Deque<Integer> stack = new LinkedList<>();
		for (int i = 0; i < nums2.length; i++) {
			while (!stack.isEmpty()&&nums2[stack.peek()]<nums2[i]){
				int i1 = nums2[stack.pop()];
				if (map.containsKey(i1)){
					res[map.get(i1)] = nums2[i];
				}
			}
			stack.push(i);
		}
		return res;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
