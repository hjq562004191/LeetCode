package com;

import Test.StackTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 二叉树的层次遍历 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
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
            lists.add(list);
        }
        return lists;
    }

}
