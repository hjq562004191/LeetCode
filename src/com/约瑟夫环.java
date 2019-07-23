package com;

import java.util.Scanner;

/**
 * 有n个人围成一圈，按顺序从1到n编号。从第一个人开始报数，报数3的人退出圈子，下一个人从1开始重新报数，报数3的人退出圈子。如此循环，直到留下最后一个人。依次输出退出人的编号：
 *
 * 输入测试用例：1 4 (第一个数代表测试用例个数，第二个数代表编号n)
 *
 * 输出：3 2 4 1
 */
public class 约瑟夫环 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ListNode head;
        ListNode temp = new ListNode(0);
        head = temp;
        temp.next = new ListNode(1);
        temp = temp.next;
        for (int i = 2; i <= n; i++) {
            ListNode node = new ListNode(i);
            temp.next = node;
            temp = temp.next;
        }
        temp.next = head.next;
        int k;
        ListNode pre = head;
        temp = head;
        for (int i = 0; i < n; i++) {
            for (k = 0; k < 3; k++) {
                pre = temp;
                temp = temp.next;
            }
            System.out.println(temp.v);
            pre.next = temp.next;
        }
    }
}
class ListNode{
    public int v;
    ListNode next;
    public ListNode(int m){
        v = m;
    }
}
