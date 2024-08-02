package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID234PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new ID234PalindromeLinkedList().new Solution();
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
        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return true;
            }
            ListNode firstHalfEnd = endOfFirstHalf(head);
            ListNode secondHalfStart = reverseList(firstHalfEnd.next);

            // 判断是否回文
            ListNode p1 = head;
            ListNode p2 = secondHalfStart;
            boolean res = true;
            while (res && p2 != null) {
                if (p1.val != p2.val) {
                    res = false;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            firstHalfEnd.next = reverseList(secondHalfStart);
            return res;

        }

        private ListNode endOfFirstHalf(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        private ListNode reverseList(ListNode head) {
            ListNode cur = head;
            ListNode pre = null;
            ListNode temp = null;
            while (cur != null) {
                temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            return pre;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
