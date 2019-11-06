package com;

/**
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 *
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 反转链表II {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = null;
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = null;
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = null;
        ListNode h = reverseBetween(head,1,1);
        while (h!=null){
            System.out.print(h.val + "->");
            h = h.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode h = new ListNode(0);
        h.next = head;
        for (int i = 1; i < m; i++) {
            h = h.next;
        }
        ListNode temp = h.next;
        ListNode end = h.next;
        ListNode t2 = end.next;
        for (int i = m; i <= n; i++) {
            temp = end;
            end = t2;
            if (t2 != null) {
                t2 = t2.next;
                end.next = temp;
            }else {
                end = null;
            }
        }
        if (end != null ) {
            end.next = t2;
            h.next.next = end;
            h.next = temp;
        }else {
            h.next.next = null;
            h.next = temp;
        }
        if (m == 1) {
            return h.next;
        }else {
            return head;
        }
    }


}
