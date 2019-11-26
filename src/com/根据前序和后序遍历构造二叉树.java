package com;

/**
 * 返回与给定的前序和后序遍历匹配的任何二叉树。
 *
 *  pre 和 post 遍历中的值是不同的正整数。
 *
 *  
 *
 * 示例：
 *
 * 输入：pre = [1,2,4,5,3,6,7], post = [4,5,2,6,7,3,1]
 * 输出：[1,2,3,4,5,6,7]
 *  
 *
 * 提示：
 *
 * 1 <= pre.length == post.length <= 30
 * pre[] 和 post[] 都是 1, 2, ..., pre.length 的排列
 * 每个输入保证至少有一个答案。如果有多个答案，可以返回其中一个。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 根据前序和后序遍历构造二叉树 {
    public static void main(String[] args) {
        int[] pre = {1,2,4,5,3,6,7};
        int[] post = {4,5,2,6,7,3,1};
        constructFromPrePost(pre,post);
    }
    public static TreeNode constructFromPrePost(int[] pre, int[] post) {
        return helper(pre,post,0,pre.length-1,0,post.length-1);
    }

    private static TreeNode helper(int[] pre, int[] post, int ps, int pe, int pos, int poe) {
        if (ps > pe || pos > poe){
            return null;
        }
        TreeNode root = new TreeNode(pre[ps]);
        if (ps == pe){
            return root;
        }
        int index = 0;
        while (pre[ps+1] != post[index]){
            index++;
        }
        root.left = helper(pre,post,ps+1,ps+1+index-pos,pos,index);
        root.right = helper(pre,post,ps+2+index-pos,pe,index+1,poe-1);
        return root;
    }
}
