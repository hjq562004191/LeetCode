package com;

public class 接雨水二刷 {
    public static void main(String[] args) {
        int[] num = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(num));
    }
    public static int trap(int[] height) {
        int sum = 0;
        int left = 0;
        int right = height.length - 1;
        int left_max = 0;
        int right_max = 0;
        while (right > left){
            if (height[left] < height[right]){
                if (height[left] > left_max){
                    left_max = height[left];
                }else {
                    sum += left_max - height[left];
                    left++;
                }
            }else {
                if (height[right] > right_max){
                    right_max = height[right];
                }else {
                    sum += right_max - height[right];
                    right--;
                }
            }
        }
        return sum;
    }
}
