package com;
/**
 *     1
 *     1 1
 *     1 2 1
 *     1 3 3 1
 *     1 4 6 4 1
 *     1 5 10 10 5 1
 */

import java.util.ArrayList;
import java.util.List;

/**
 *给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 示例:
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 *
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 *
 */
public class 杨辉三角II {
    public static void main(String[] args) {
        getRow(3);
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex == 0){
            list.add(1);
            return list;
        }
        if (rowIndex == 1){
            list.add(1);
            list.add(1);
            return list;
        }
        int[][] map = new int[100][100];
        map[0][0] = 1;
        map[1][0] = 1;
        map[1][1] = 1;
        int i,j;
        for (i = 2; i <= rowIndex; i++) {
            map[i][0] = 1;
            for (j = 1; j < i; j++) {
                map[i][j] = map[i-1][j]+map[i-1][j-1];
            }
            map[i][i] = 1;
        }
        for (int k = 0; k <= rowIndex; k++) {
            list.add(map[rowIndex][k]);
            System.out.println(map[rowIndex][k]);
        }
        return list;
    }
}
