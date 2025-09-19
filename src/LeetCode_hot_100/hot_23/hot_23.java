package LeetCode_hot_100.hot_23;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/19 10:22
 */
public class hot_23 {

    /**
     * 反转链表
     * @param head 一个链表的头指针
     * @return 返回反转后的链表头指针
     */
    public ListNode reverseList(ListNode head) {
        // 比较拉的方法
//        if (head != null) {
//            ListNode front = head;
//            ListNode headB = new ListNode(front.val, null);
//            while (front.next != null) {
//                front = front.next;
//                headB = new ListNode(front.val, headB);
//            }
//            head = headB;
//        }
//        return head;
        // 迭代方式
//        ListNode pre = null; ListNode cur = head;
//        while (cur != null) {
//            ListNode back = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = back;
//        }
//        return cur;
        // 递归方式 null -> 1 -> 2 -> 3 -> 4 -> 5
        return reverse(head, null);
    }

    private ListNode reverse(ListNode cur, ListNode pre) {//cur 5   pre  4   tmp  5
        if (cur == null) return pre;
        ListNode tmp = reverse(cur.next, cur); //返回反转链表头节点
        cur.next = pre;
        return tmp;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
