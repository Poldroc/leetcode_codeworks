package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID2095DeleteTheMiddleNodeOfALinkedList{
    public static void main(String[] args) {
        Solution solution = new ID2095DeleteTheMiddleNodeOfALinkedList().new Solution();
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy.next;
        ListNode slow = dummy;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
