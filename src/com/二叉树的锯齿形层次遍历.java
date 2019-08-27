package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的锯齿形层次遍历 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        List<List<Integer>> lists = zigzagLevelOrder(root);
        for (List<Integer> l:lists
             ) {
            for (Integer i:l
                 ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int num = 1;
        int count;
        while (!queue.isEmpty()){
            count = queue.size();
            List<Integer> list = new LinkedList<>();
            while (count > 0){
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (num % 2 == 0) {
                    if (temp.left != null) {
                        queue.add(temp.left);
                    }
                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                }else {
                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                    if (temp.left != null) {
                        queue.add(temp.left);
                    }
                }
                count--;
            }
            num++;
            lists.add(list);
        }

        return lists;
    }
}
