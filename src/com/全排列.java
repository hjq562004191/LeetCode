package com;

import java.util.LinkedList;
import java.util.List;

/*
给定一个没有重复数字的序列，返回其所有可能的全排列。

示例:

输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
public class 全排列 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4};
        List<List<Integer>> lists=permute(n);
        for (List l:lists
                ) {
            for (Object i:l
                    ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> lists = new LinkedList<>();
    public static List<List<Integer>> permute(int[] nums) {
        int[] map = new int[nums.length];
        List<Integer> list = new LinkedList<>();
        DFS(map,nums,list);
        return lists;
    }

    private static void DFS(int[] map, int[] nums,List<Integer> list) {

        int[] m = map.clone();
        List<Integer> list1 = new LinkedList<>(list);
        if (list1.size() == nums.length){
            lists.add(list1);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (m[i] == 0 ){
//                System.out.println(nums[i]);
                list1.add(nums[i]);
                m[i] = 1;
                DFS(m,nums,list1);
                m[i] = 0;
                list1.remove(new Integer(nums[i]));
            }
        }
    }

}
