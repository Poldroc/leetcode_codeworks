package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID19RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new ID19RemoveNthNodeFromEndOfList().new Solution();
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dumyhead = new ListNode(-1);
            dumyhead.next = head;
            ListNode fast = dumyhead;
            ListNode slow = dumyhead;

            for (int i = 0; i < n + 1; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return dumyhead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
