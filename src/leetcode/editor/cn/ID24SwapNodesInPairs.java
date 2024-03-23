package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID24SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new ID24SwapNodesInPairs().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode dumyhead = new ListNode(-1);
            dumyhead.next = head;
            ListNode cur = dumyhead;
            // 保存两个节点后面的节点
            ListNode temp;
            // 保存两个节点的第一个
            ListNode firstnode;
            // 第二个
            ListNode secondnode;
            while (cur.next != null && cur.next.next != null) {
				temp = cur.next.next.next;
				firstnode = cur.next;
				secondnode = cur.next.next;
				cur.next = secondnode;
                secondnode.next = firstnode;
				firstnode.next = temp;
                cur = firstnode;
            }
			return dumyhead.next;
		}
    }
//leetcode submit region end(Prohibit modification and deletion)

}
