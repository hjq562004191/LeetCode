package com;
/**
 * 54. 螺旋矩阵
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 示例 2:
 *
 * 输入:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/spiral-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.List;

public class 螺旋矩阵 {
    public static void main(String[] args) {
        int[][] m = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        spiralOrder(m);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int x = matrix.length;
        if (x == 0){
            return null;
        }
        int y = matrix[0].length;
        int sum = x*y;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        int[][] map = new int[x][y];
        while (true){
            if (sum == list.size()){
                break;
            }
            for (int i = index; i < y-index; i++) {
                if (map[index][i]!=1) {
                    list.add(matrix[index][i]);
                    map[index][i] = 1;
                }
            }
            if (sum == list.size()){
                break;
            }
            for (int i = index; i < x-index; i++) {
                if (map[i][y-index-1]!=1) {
                    list.add(matrix[i][y - 1 - index]);
                    map[i][y-index-1] = 1;
                }
            }
            if (sum == list.size()){
                break;
            }
            for (int i = y-1-index; i > index; i--) {
                if (map[x-1-index][i] != 1) {
                    list.add(matrix[x - 1 - index][i]);
                    map[x-1-index][i] = 1;
                }
            }
            if (sum == list.size()){
                break;
            }
            for (int i = x-1-index; i > index ; i--) {
                if (map[i][index] != 1) {
                    list.add(matrix[i][index]);
                    map[i][index] = 1;
                }
            }
            if (sum == list.size()){
                break;
            }
            index++;
        }
        return list;
    }
}
