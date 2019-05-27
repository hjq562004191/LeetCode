package com;

public class 移除元素 {
    public static void main(String[] args) {
        int[] n = new int[1];
        n[0] = 3;
//        n[1] = 2;
//        n[2] = 2;
//        n[3] = 3;
        removeElement(n, 3);
    }

    public static int removeElement(int[] nums, int val) {
        int idex = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums[idex] = nums[i];
                idex++;
            }
        }
//        System.out.println(idex);
        return idex;
    }
}
