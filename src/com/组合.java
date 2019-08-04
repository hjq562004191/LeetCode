package com;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 *
 * 示例:
 *
 * 输入: n = 4, k = 2
 * 输出:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combinations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 组合 {
    public static void main(String[] args) {
        combine(4,3);
        for (List<Integer> l:lists
             ) {
            for (Integer i:l
                 ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> lists;
    public static List<List<Integer>> combine(int n, int k) {
        lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        DFS(n, k, list,1);
        return lists;
    }

    private static void DFS(int n, int k, List<Integer> list1, int step) {
        List<Integer> list = new LinkedList<>(list1);
        if (list.size() == k ){
            lists.add(list);
        }else {
            for (int i = step; i <= n; i++) {
                list.add(i);
                DFS(n, k, list, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
