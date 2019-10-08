package com;

import java.util.Random;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 对称二叉树 {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        if (root.right == null && root.left == null){
            return true;
        }else {
            return BFS(root,root);
        }

    }

    private boolean BFS(TreeNode r, TreeNode l) {
        if (r == null && l == null){
            return true;
        }
        if ( (r != null && l == null) || (r == null && l != null) )
        {
            return false;
        }
        if (r.val == l.val){
            return BFS(r.left,l.right) && BFS(r.right,l.left);
        }
        return false;
    }


}
