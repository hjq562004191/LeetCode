package com;


public class 两数相加 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumlist = new ListNode(0);
        ListNode temp = sumlist;
        for (int i = 0; i < 100; i++) {
            if(l1!=null && l2!=null){
                temp.next = new ListNode(l1.val+l2.val);
                if (l1.next != null ) {
                    l1 = l1.next;
                }
                if (l2.next != null){
                   l2 = l2.next;
                }
                if (l1.next == null && l2.next == null)
                    break;
                temp = temp.next;
            }else if (l1!=null&&l2 == null){
                temp.next = new ListNode(l1.val);
                if (l1.next != null)
                l1 = l1.next;
                else
                    break;
            }else if (l2!=null&&l1 == null){
                temp.next = new ListNode(l2.val);
                if (l2.next != null)
                l2 = l2.next;
                else
                    break;
            }else {
                break;
            }
        }
        temp = sumlist.next;
        for (int i = 0; i < 100; i++) {
            if (temp==null)
                break;
            if (temp.val>=10){
                temp.val -= 10;
                if (temp.next != null)
                    temp.next.val+=1;
                else
                    temp.next = new ListNode(1);
            }
//            if (i == count && temp.val >= 10){
//                temp.val-=10;
//                temp.next = new ListNode(1);
//            }
            temp = temp.next;
        }
//        String c1="",c2="";
//        for (int i = 0; i < 100; i++) {
//            if (temp!=null){
//               c1 = c1 + String.valueOf(temp.val);
//                temp=temp.next;
//            }
//        }
//        temp = l2;
//        for (int i = 0; i < 100; i++) {
//            if (temp!=null){
//                c2 = c2 + String.valueOf(temp.val);
//                temp=temp.next;
//            }
//        }
//        BigInteger count1=new BigInteger(c1);
//        System.out.println(count1);
//        BigInteger count2=new BigInteger(c2);
//        System.out.println(count2);
//        count1=count1.add(count2);
//        System.out.println(count1);
//        temp = new ListNode(Integer.valueOf(count1.remainder(new BigInteger("10")).toString()));
//        count1=count1.divide(new BigInteger("10"));
//        sumlist.next = temp;
//        for (int i = 0; i < 10; i++) {
//            if (count1.toString().equals("0"))
//                break;
//            else {
//                temp.next = new ListNode(Integer.valueOf(count1.remainder(new BigInteger("10")).toString()));
//                temp = temp.next;
//                count1=count1.divide(new BigInteger("10"));
//            }
//        }
        temp = sumlist.next;
        for (int i = 0; i < 100; i++) {
            if (temp !=null){
                System.out.println(temp.val);
                temp = temp.next;
            }else {
                break;
            }
        }
        return sumlist.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        addTwoNumbers(l1,l2);
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
