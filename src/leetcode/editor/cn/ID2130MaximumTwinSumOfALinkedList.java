package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID2130MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {
        Solution solution = new ID2130MaximumTwinSumOfALinkedList().new Solution();
        StringBuilder sb = new StringBuilder();
        //[5,4,2,1]
        ListNode head = new ListNode(5);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        //执行测试
        solution.pairSum(head);
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
        public int pairSum(ListNode head) {
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            // 翻转
            ListNode last = slow;
            ListNode pre = last.next;
            ListNode post = pre.next;
            pre.next = null;
            while (post != null) {
                ListNode tmp = post.next;
                post.next = pre;
                pre = post;
                post = tmp;
            }
            ListNode n1 = head;
            int ans = n1.val + pre.val;
            while (pre.next != null) {
                n1 = n1.next;
                pre = pre.next;
                ans = Math.max(ans, n1.val + pre.val);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
