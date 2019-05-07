package com;
/*
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.
说明：

给定的 n 保证是有效的。

进阶：

你能尝试使用一趟扫描实现吗？
 */
public class 删除链表的倒数第N个节点 {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1 && head.next == null){
            return null;
        }
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode pre,end,ppre;
        pre = h;
        end = h;
        for (int i = 0; i < n; i++) {
            end = end.next;
        }
        while (end.next!=null){
            pre = pre.next;
            end = end.next;
        }
        if (n>=2)
        pre.next = pre.next.next;
        if (n == 1){
            pre.next = null;
        }
        return h.next;
    }
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
  }
}
