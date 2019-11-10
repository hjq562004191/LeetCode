package niuke;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复
 * 的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class 重建二叉树 {
    public static void main(String[] args) {
        int[] p = {3,9,20,15,7};
        int[] i = {9,3,15,20,7};
        TreeNode re = reConstructBinaryTree(p,i);
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode treeNode = Build(pre,0,pre.length - 1,in,0,pre.length - 1);
        return treeNode;
    }

    private static TreeNode Build(int[] pre,int ps, int pe,  int[] in,int is,int ie) {
        if (ps > pe){
            return null;
        }
        TreeNode tree = new TreeNode(pre[ps]);
        int i = is;
        for (;pre[ps] != in[i] && i < ie; i++) {

        }
        tree.left = Build(pre,ps + 1,ps + i - is,in,is,i-1);
        tree.right = Build(pre,ps + i -is +1 ,pe,in,i+1,ie);
        return tree;
    }
}
