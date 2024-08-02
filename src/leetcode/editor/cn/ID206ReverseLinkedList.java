package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID206ReverseLinkedList{
	public static void main(String[] args) {
		Solution solution = new ID206ReverseLinkedList().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode tmp = null;
		while (cur!=null){
			tmp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = tmp;
		}
		return pre;
    }
	// 1-2-3-4-5-null
}
//leetcode submit region end(Prohibit modification and deletion)

}
