package LeetCode_hot_100.hot_24;

import java.util.Stack;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/21 11:41
 */
public class hot_24 {
    /**
     * 回文链表
     * @param head 单链表头节点
     * @return 如果是回文链表返回true，否则返回false
     */
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMiddle(head);
        ListNode head2 = Reverse(mid);
        while (head2 != null && head != null) {
            if (head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }

    private ListNode getMiddle(ListNode head) {
        ListNode quick = head;
        ListNode slow = head;
        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode Reverse(ListNode pre) {
        ListNode cur = pre; pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
