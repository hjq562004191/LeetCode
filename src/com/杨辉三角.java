package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 杨辉三角 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows == 1){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list.add(list1);
            return list;
        }
        if (numRows == 2){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(1);
            list.add(list1);
            list.add(list2);
            return list;
        }
        int[][] map = new int[100][100];
        map[0][0] = 1;
        map[1][0] = 1;
        map[1][1] = 1;
        int i,j;
        for (i = 2; i < numRows; i++) {
            map[i][0] = 1;
            for (j = 1; j < i; j++) {
                map[i][j] = map[i-1][j]+map[i-1][j-1];
            }
            map[i][i] = 1;
        }
        for (int k = 0; k < numRows; k++) {
            List temp = new ArrayList();
            for (int l = 0; l < k +1; l++) {
                temp.add(map[k][l]);
            }
            list.add(temp);
        }
        return list;
    }
}
