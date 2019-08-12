package com;

/*
给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

import java.util.*;

public class 三数之和 {
    public static void main(String[] args) {
        int[] n = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(n);
        System.out.println(lists.size());
        for (List<Integer> l : lists
        ) {
            for (Integer i : l
            ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list;
        int l;
        int r;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                l = i + 1;
                r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0) {
                        list = new LinkedList<>();
                        list.add(nums[i]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        lists.add(list);
                        l++;
                        r--;
                        while (nums[l] == nums[l - 1] && l < r) {
                            l++;
                        }
                        while (nums[r] == nums[r + 1] && r > l) {
                            r--;
                        }
                    }

                    if (sum > 0) {
                        r--;
                    } else if (sum < 0){
                        l++;
                    }
                }
            }
        }
        return lists;
    }
}
