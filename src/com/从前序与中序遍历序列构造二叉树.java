package com;

public class 从前序与中序遍历序列构造二叉树 {
    public static void main(String[] args) {
        int[] p = {3,9,20,15,7};
        int[] i = {9,3,15,20,7};
        TreeNode re = buildTree(p,i);
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = build(preorder,0,preorder.length - 1,
                inorder,0,inorder.length -1);
        return root;
    }

    private static TreeNode build(int[] preorder,int pstart,int pend, int[] inorder,
                                  int istart,int iend) {
        if (pstart > pend){
            return null;
        }

        TreeNode tree = new TreeNode(preorder[pstart]);

        int i = istart;
        for (;preorder[pstart] != inorder[i] && i < iend ; i++) {

        }
        tree.left = build(preorder,pstart + 1,pstart + i-istart,
                inorder,istart,i - 1);
        tree.right = build(preorder,pstart + i - istart +1,pend,
                inorder,i+1,iend);

        return tree;
    }
}
