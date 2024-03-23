package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID160IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        Solution solution = new ID160IntersectionOfTwoLinkedLists().new Solution();
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
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a = headA, b = headB;
			// 两者如果不相交,则走完都为null
            while (a != b) {
                a = a != null ? a.next : headB;
                b = b != null ? b.next : headA;
            }
			return a;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
