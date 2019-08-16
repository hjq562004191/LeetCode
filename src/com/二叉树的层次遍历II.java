package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class 二叉树的层次遍历II {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        queue.add(root);
        int count;
        while (!queue.isEmpty()){
            count = queue.size();
            List<Integer> list = new LinkedList<>();
            while (count > 0){
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
                count--;
            }
            stack.push(list);
        }
        while (!stack.empty()){
            lists.add(stack.pop());
        }
        return lists;
    }
}
