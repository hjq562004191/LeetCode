package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 *
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 */

public class 全排列2 {
    public static void main(String[] args) {
        int[] n = {2,2,1,1};
        List<List<Integer>> lists = permuteUnique(n);
        for (List l : lists
        ) {
            for (Object i : l
            ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> lists;
    static HashSet<List<Integer>> hashSet;
    public static List<List<Integer>> permuteUnique(int[] nums) {
        int[] map = new int[nums.length];
        lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        hashSet = new HashSet<>();
        DFS(map, nums, list);
        return lists;
    }
    private static void DFS(int[] map, int[] nums, List<Integer> list) {
        int[] m = map.clone();
        List<Integer> list1 = new ArrayList<>(list);
        if (list1.size() == nums.length) {
            if (!hashSet.contains(list1)) {
                hashSet.add(list1);
                lists.add(list1);
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (m[i] == 0 ) {
                list1.add(nums[i]);
                int index = list1.size();
                m[i] = 1;
                DFS(m, nums, list1);
                m[i] = 0;
                list1.remove(index-1);
            }
        }
    }
}
