package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 组合总和 {
    public static void main(String[] args) {
        int[] a ={2,3,6,7};
        combinationSum(a,7);
    }
    static List<List<Integer>> lists ;
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        lists = new ArrayList<>();
        int[] map = new int[candidates.length];
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        Arrays.sort(candidates);
        DFS(candidates,list,sum,target,0);
        return lists;
    }

    private static void DFS( int[] candidates, List<Integer> list1,int sum,int tar,int j) {
        if (sum == tar){
            lists.add(list1);
            return;
        }
        if (tar<candidates[j])
            return;
        if (sum>tar){
            return;
        }
        for (int i = j; i < candidates.length; i++) {
            List<Integer> list=new ArrayList<>(list1);
            list.add(candidates[i]);
            DFS(candidates,list,sum+candidates[i],tar,i);
        }
    }
}
