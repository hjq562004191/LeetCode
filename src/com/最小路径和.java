package com;

/**
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 *   [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 最小路径和 {
    public static void main(String[] args) {
        int[][] s = {
                {1, 2, 5},
                {3, 2, 1},

        };
        minPathSum(s);
    }

    public static int minPathSum(int[][] grid) {
        int j1 = grid[0].length;
        int i1 = grid.length;
        System.out.println(i1);
        System.out.println(j1);
        int[][] dp = new int[i1][j1];
        for (int i = 0; i < j1; i++) {
            if (i == 0) {
                dp[0][i] = grid[0][i];
            } else {
                dp[0][i] = grid[0][i] + dp[0][i - 1];
            }
        }
        for (int i = 1; i < i1; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < i1; i++) {
            for (int j = 1; j < j1; j++) {
                dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < j1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(dp[x-1][y-1]);
        return dp[i1 - 1][j1 - 1];
    }
}
