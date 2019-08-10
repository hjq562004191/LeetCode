package com;

import java.util.*;

public class 组合总和II {
    public static void main(String[] args) {
        combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }

    static List<List<Integer>> lists;
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int[] map = new int[candidates.length];
        lists = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        DFS(map, candidates, target, 0, list, 0);
        for (List<Integer> l : lists
        ) {
            for (Integer P : l
            ) {
                System.out.print(P + " ");
            }
            System.out.println();
        }
        return lists;
    }

    private static void DFS(int[] map, int[] candidates, int target, int step, List<Integer> list1, int sum) {
        List<Integer> list = new ArrayList<>(list1);
        if (sum == target) {
            lists.add(list);
        } else {
            for (int i = step; i < candidates.length && candidates[i] <= target; i++) {
                if (sum > target && candidates[i] <= target) {
                    return;
                }
                if(i>step&&candidates[i]==candidates[i-1])
                {
                    continue;
                }
                if (map[i] != 1) {
                    map[i] = 1;
                    list.add(candidates[i]);
                    sum += candidates[i];
                    DFS(map, candidates, target, i + 1, list, sum);
                    sum -= candidates[i];
                    map[i] = 0;
                    list.remove(list.size() - 1);
                }
            }
        }

    }

}
