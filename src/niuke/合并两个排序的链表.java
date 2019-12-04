package niuke;


public class 合并两个排序的链表 {
    public static void main(String[] args) {
        ListNode head1= new ListNode(2);
//        head1.next = new ListNode(2);
//        head1.next.next = new ListNode(3);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(5);
        ListNode l = Merge(head1,head2);
        while (l!=null){
            System.out.println(l.val);
            l = l.next;
        }
    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode t2 = list2 , t1 = list1;
        ListNode pre = new ListNode(0);
        pre.next = list1;
        ListNode temp = list1;
        ListNode temp2;
        while(list2 != null){
            temp2 = list2.next;
            while(temp != null && list2.val >= temp.val){
                pre = pre.next;
                temp = temp.next;
            }
            pre.next = list2;
            pre = pre.next;
            list2.next = temp;
            list2 = temp2;
        }
        return t1.val > t2.val ? t2:t1;
    }
}
