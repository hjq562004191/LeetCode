package com;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class 最接近的三数之和 {
    public static void main(String[] args) {
        int a[] = {0,0,0};
        int s = threeSumClosest(a,1);
        System.out.println(s);
    }
    public static int threeSumClosest(int[] nums, int target) {
        int res;
        int l,r;
        Arrays.sort(nums);
        int min = Math.abs(nums[0] + nums[1] + nums[2] - target);
        int s = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            l = i + 1;
            r = nums.length - 1;
            while (l<r){
                res = nums[i] + nums[l] + nums[r];
                if (min > Math.abs(res - target)){
                    min = Math.abs(res - target);
                    s = res;
                }
                if (res - target > 0){
                    r--;
                }
                if (res - target < 0){
                    l++;
                }
                if (res == target){
                    return target;
                }
            }
        }
        return s;
    }
}
