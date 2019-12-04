package niuke;

import java.util.*;

public class 从上往下打印二叉树 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ArrayList<Integer> list = PrintFromTopToBottom(root);
        for (Integer i:list
             ) {
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if (temp.left!=null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
                list.add(temp.val);
        }

        return list;
    }

}
