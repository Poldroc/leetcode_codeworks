package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID141LinkedListCycle{
	public static void main(String[] args) {
		Solution solution = new ID141LinkedListCycle().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast!=null){
			fast = fast.next;
			if (fast!=null){
				fast = fast.next;
			}
			if (fast == slow){
				return true;
			}
			slow = slow.next;
		}
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
