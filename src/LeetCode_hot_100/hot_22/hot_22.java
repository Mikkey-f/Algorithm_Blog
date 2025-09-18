package LeetCode_hot_100.hot_22;

/**
 * @Author: Mikkeyf
 * @CreateTime: 2025/9/18 14:11
 */
public class hot_22 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        /**
         * 相交链表
         * @param headA 单链表
         * @param headB 单链表
         * @return 找出并返回两个链表相交的起始节点，不存在返回null
         */
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            // O(n * m)
//            while (headA != null) {
//                ListNode temp = headB;
//                while (temp != null) {
//                    if (headA == temp) {
//                        return headA;
//                    }
//                    temp = temp.next;
//                }
//                headA = headA.next;
//            }
//            return null;
            // O(n + m)
            ListNode tempA = headA;
            ListNode tempB = headB;
            while (tempA != tempB) {
                tempA = tempA != null ? tempA.next : headB;
                tempB = tempB != null ? tempB.next : headA;
                if (tempA == tempB) {
                    break;
                }
            }
            return tempA;
        }
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
}
