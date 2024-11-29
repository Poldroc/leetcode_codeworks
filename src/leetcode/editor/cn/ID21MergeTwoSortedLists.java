package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID21MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new ID21MergeTwoSortedLists().new Solution();
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode listNode = new ListNode(-1);
            ListNode pre = listNode;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    pre.next = list1;
                    list1 = list1.next;
                } else {
                    pre.next = list2;
                    list2 = list2.next;
                }
                pre = pre.next;
            }
            pre.next = list1 == null ? list2 : list1;
            return listNode.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
