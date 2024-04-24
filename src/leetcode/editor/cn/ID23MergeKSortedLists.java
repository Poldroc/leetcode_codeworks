package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID23MergeKSortedLists {
    public static void main(String[] args) {
        Solution solution = new ID23MergeKSortedLists().new Solution();
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
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode res = null;
            for (ListNode list : lists) {
                res = merge2Lists(res, list);
            }
            return res;
        }

        private ListNode merge2Lists(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode tail = dummyHead;
            while (l1 != null && l2 != null) {
                if (l1.val > l2.val) {
                    tail.next = l2;
                    l2 = l2.next;
                } else {
                    tail.next = l1;
                    l1 = l1.next;
                }
                tail = tail.next;
            }
            tail.next = l1 == null ? l2 : l1;
            return dummyHead.next;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
