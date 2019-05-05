package com;

public class 验证二叉搜索树 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
//        root.right = null;
//        root.right = new TreeNode(15);
//        root.left.left = null;
//        root.left.right = null;
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(20);
        boolean t = isValidBST(root);
        System.out.println(t);
    }
    static int[] res;
    static int k;
    public static boolean isValidBST(TreeNode root) {
        int k = 0;
        res = new int[99999];
        if (root == null || (root.right == null && root.left == null))
            return true;
        read(root);

        for (int i = 0; i < k - 1; i++) {
//            System.out.println(res[i] + " ");
            if (res[i] >= res[i+1]){
                return false;
            }
        }
        return true;
    }

    private static void read(TreeNode root) {
         if (root.left!=null)
        read(root.left);

        res[k++] = root.val;

        if (root.right != null)
        read(root.right);
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
