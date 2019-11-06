package com;
@SuppressWarnings("all")
public class K个一组翻转链表 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = null;
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = null;
        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next = null;
        ListNode h = reverseKGroup(head,2);
        while (h!=null){
            System.out.print(h.val + "->");
            h = h.next;
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        if (count != k) {
            for (int i = 0 ; i <  count / k; i++) {
                head = reverseBetween(head, i*k + 1, i*k + k);
            }
        }else {
            head = reverseBetween(head,1,k);
        }

        return head;
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
