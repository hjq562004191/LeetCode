package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 示例:
 *
 * 输入: 3
 * 输出:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/spiral-matrix-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 螺旋矩阵II {
    public static void main(String[] args) {
        generateMatrix(3);
    }
    public static int[][] generateMatrix(int n) {
        int sum = n*n;
        int index = 0;
        int k = 1;
        int[][] map = new int[n][n];
        while (k<=sum){
            for (int i = index; i < n-index; i++) {
                if (map[index][i] == 0) {
                    map[index][i] = k++;
                }
            }
            for (int i = index; i < n-index; i++) {
                if (map[i][n-index-1]==0) {
                    map[i][n-index-1] = k++;
                }
            }
            for (int i = n-1-index; i > index; i--) {
                if (map[n-1-index][i] == 0) {
                    map[n-1-index][i] = k++;
                }
            }
            for (int i = n-1-index; i > index ; i--) {
                if (map[i][index] == 0) {
                    map[i][index] = k++;
                }
            }
            index++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(map[i][j]);
            }
        }
        return map;
    }
}
