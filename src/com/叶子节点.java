package com;

public class 叶子节点 {
    public static void main(String[] args) {

    }
    public static int findleves(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.right == null && root.left == null){
            return 1;
        }
        return findleves(root.right) + findleves(root.left);
    }
}
