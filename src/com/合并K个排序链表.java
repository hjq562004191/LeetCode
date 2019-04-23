package com;

import java.util.Arrays;

public class 合并K个排序链表 {
    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = new ListNode(1);
        listNodes[0].next = new ListNode(4);
        listNodes[0].next.next = new ListNode(5);
        listNodes[1] =  new ListNode(1);
        listNodes[1].next = new ListNode(3);
        listNodes[1].next.next = new ListNode(4);
        listNodes[2] =  new ListNode(2);
        listNodes[2].next = new ListNode(6);
        ListNode result = mergeKLists(listNodes);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        int[] a = new int[99999];
        int k = 0;
        for (ListNode l:lists
             ) {
            while (l!=null) {
                a[k++] = l.val;
                l = l.next;
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = i+1; j < k; j++) {
                if (a[i] > a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
//        for (int i = 0; i < k; i++) {
//            System.out.println(a[i]);
//        }
        ListNode result = new ListNode(0);
        result.next = null;
        ListNode temp = result;
        for (int i = 0; i < k; i++) {
            temp.next = new ListNode(a[i]);
            temp = temp.next;
        }
        return result.next;
    }
    private static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
