package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 *
 * 例如，给定三角形：
 *
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 *
 * 说明：
 *
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 三角形最小路径和 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new LinkedList<>();
        List<Integer> l1 = new LinkedList<>();
        l1.add(-1);
        List<Integer> l2 = new LinkedList<>();
        l2.add(3);l2.add(2);
        List<Integer> l3 = new LinkedList<>();
        l3.add(-3);l3.add(1);l3.add(1);
//        List<Integer> l4 = new LinkedList<>();
//        l4.add(4);l4.add(1);l4.add(8);l4.add(3);
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
//        triangle.add(l4);
        minimumTotal(triangle);
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1){
            return triangle.get(0).get(0);
        }
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = triangle.get(i).get(j);
            }
        }
        dp[1][0] += dp[0][0];
        dp[1][1] += dp[0][0];
        for (int i = 2; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    dp[i][j] += dp[i - 1][0];
                }else if (j == triangle.get(i).size() - 2){
                    dp[i][j] += Math.min(dp[i - 1][j],dp[i-1][j-1]);
                }else if (j == triangle.get(i).size() - 1){
                    dp[i][j] += dp[i-1][j-1];
                }else {
                    dp[i][j] += Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }
        for (int i = 0; i <triangle.size() ; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < triangle.get(triangle.size() - 1).size(); i++) {
            if (min > dp[triangle.size() - 1][i]){
                min = dp[triangle.size() - 1][i];
            }
        }
        return min;
    }
}
