package com;

public class 两两交换链表中的节点 {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        swapPairs(l);
    }
    public static ListNode swapPairs(ListNode head) { // 1 2 3 4
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
