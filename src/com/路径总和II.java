package com;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * 返回:
 * <p>
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 路径总和II {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(-2);
        treeNode.left = null;
        treeNode.right = new TreeNode(-3);
        List<List<Integer>> list = pathSum(treeNode,-5);
        for (List<Integer> l:list
             ) {
            for (Integer i:l
                 ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static List<List<Integer>> lists;
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return lists;
        DFS(root, sum, list, 0);
        return lists;
    }

    private static void DFS(TreeNode root, int sum, List<Integer> list1, int i) {
        List<Integer> list = new ArrayList<>(list1);
        if (root.left == null && root.right == null && sum == root.val + i) {
            list.add(root.val);
            lists.add(list);
            return;
        }

            list.add(root.val);
            if (root.left != null) {
                DFS(root.left, sum, list, i + root.val);
            }
            list.remove(list.size()-1);
            list.add(root.val);
            if (root.right != null) {
                DFS(root.right, sum, list, i + root.val);
            }
            list.remove(list.size()-1);

    }
}
