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
            ListNode fast = head,slow = head;
            while (true){
                if (fast==null||fast.next==null) return null;
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) break;
            }
            fast =head;
            while (slow!=fast){
                fast = fast.next;
                slow =slow.next;
            }
            return fast;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
