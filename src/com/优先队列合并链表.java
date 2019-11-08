package com;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 优先队列合并链表 {
    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = new ListNode(1);
        listNodes[0].next = new ListNode(4);
        listNodes[0].next.next = new ListNode(5);
        listNodes[1] = new ListNode(1);
        listNodes[1].next = new ListNode(3);
        listNodes[1].next.next = new ListNode(4);
        listNodes[2] = null;
//        listNodes[2].next = new ListNode(6);
        ListNode result = mergeKLists(listNodes);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0 || lists == null)return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparing(listNode -> listNode.val));

        for (ListNode node :lists
             ) {
            while (node != null){
                queue.add(node);
                node = node.next;
            }
        }
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        while (!queue.isEmpty()){
            temp.next = queue.poll();
            temp = temp.next;
        }
        return listNode.next;
    }
}
