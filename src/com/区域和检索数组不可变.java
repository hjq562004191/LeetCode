package com;

public class 区域和检索数组不可变 {
    public static void main(String[] args) {
        int[] a = {-2, 0, 3, -5, 2, -1};
        NumArray(a);
        int s = sumRange(2,5);
//        System.out.println(s);
    }
    public static int[] sum;
    public static void NumArray(int[] nums) {
        if (nums.length == 0){
            return;
        }
        sum = nums.clone();
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + sum[i];
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(sum[i]);
//        }
    }

    public static int sumRange(int i, int j) {
        if (i == 0)
            return sum[j];
        else
            return sum[j] - sum[i-1];
    }
}
