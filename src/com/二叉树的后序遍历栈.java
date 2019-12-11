package com;

import java.util.LinkedList;
import java.util.List;


public class 二叉树的后序遍历栈 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(1);stack.addFirst(2);stack.addFirst(3);
        System.out.println(stack.peekLast());
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();

        stack.add(root);
        while (!stack.isEmpty()){
            root = stack.pollLast();
            list.addFirst(root.val);
            if (root.left!=null){
                stack.addLast(root.left);
            }
            if (root.right!=null){
                stack.addLast(root.right);
            }
        }
        return list;
    }
}
