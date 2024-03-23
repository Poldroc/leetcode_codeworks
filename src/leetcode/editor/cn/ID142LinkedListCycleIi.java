package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID142LinkedListCycleIi {
    public static void main(String[] args) {
        Solution solution = new ID142LinkedListCycleIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode slow = head, fast = head.next;
            // 判断是否有环
            while (fast != null && fast.next != null && slow != fast) {
                slow = slow.next;
                fast = fast.next.next;
            }
            if (fast == null || fast.next == null) {
                return null;
            }
            // 计算环大小
            int cnt = 1;
            ListNode node = fast.next;
            while (node != slow) {
                node = node.next;
                cnt++;
            }
            // fast先走cnt步，快慢指针相遇即为入口
            slow = head;
            fast = head;
            for (int i = 0; i < cnt; i++) {
                fast = fast.next;
            }
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return fast;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
