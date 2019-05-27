package com;

@SuppressWarnings("all")
public class 两数相加 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l1.next == null) {
            return l2;
        }
        if (l2.val == 0 && l2.next == null) {
            return l1;
        }
        ListNode sumhead = new ListNode(0);
        ListNode t1 = l1, t2 = l2;
        ListNode temp = sumhead;
        while (t1 != null && t2 != null) {
            temp.next = new ListNode(t1.val + t2.val);
            temp = temp.next;
            if (t1.next != null && t2.next != null)
                t1 = t1.next;
            else
                break;
            if (t2.next != null)
                t2 = t2.next;
            else
                break;
        }
        while (t1.next != null) {
            t1 = t1.next;
            temp.next = new ListNode(t1.val);
            temp = temp.next;
        }
        while (t2.next != null) {
            t2 = t2.next;
            temp.next = new ListNode(t2.val);
            temp = temp.next;
        }
        temp = sumhead;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.val > 9) {
                temp.val -= 10;
                if (temp.next == null) {
                    temp.next = new ListNode(1);
                } else {
                    temp.next.val += 1;
                }
            } else {
                continue;
            }
        }
        temp = sumhead.next;
        while (temp != null) {
            System.out.print(temp.val + " ");
            if (temp.next != null)
                temp = temp.next;
            else
                break;
        }
        return sumhead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(8);
//        l2.next.next = new ListNode(4);
        ListNode l = addTwoNumbers(l2, l1);
//        while (l!=null){
//            System.out.print(l.val + " ");
//            if (l.next != null)
//            l = l.next;
//            else
//            break;
//        }
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
