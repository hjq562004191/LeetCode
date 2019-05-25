package com;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */

/**
 * @author Qiang
 * @data 2019/5/25/14:10
 */
public class 合并两个有序链表 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        mergeTwoLists(l1,l2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }else if (l2 == null){
            return l1;
        }
        ListNode head = new ListNode(1);
        ListNode l3 = head;
        while (l1!=null && l2 != null){
            if (l1.val<l2.val){
               l3.next = l1;
               l3 = l3.next;
               l1 = l1.next;
            }else {
               l3.next = l2;
               l3 = l3.next;
               l2 = l2.next;
            }
        }
        if (l1 == null){
            l3.next = l2;
        }else {
            l3.next = l1;
        }
        ListNode temp = head.next;
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        return head.next;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
