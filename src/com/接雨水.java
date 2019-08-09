package com;

public class 接雨水 {
    public static void main(String[] args) {
        trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }
    public static int trap(int[] height) {
        if (height.length <= 2){
            return 0;
        }
        int max = 0;
        int max2 = 0;
        int[] cup = new int[height.length];
        int l = 0;
        int r = height.length - 1;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max)max = height[i];
        }
        while (l<r){
            if (height[l] == 0){
                l++;
            }else if (height[r] == 0){
                r--;
            }else if (height[l] > height[r]){
                if (height[r] >= max2) {
                    max2 = height[r];
                    if (cup[r] <= height[r]) {
                        cup[l] = height[l];
                        for (int i = r; i > l; i--) {
                            if (cup[i] < height[r]) {
                                cup[i] = height[r];
                            }
                        }
                    }
                }
                r--;
            }else if (height[l] < height[r] ){
                if ( height[l] >= max2) {
                    max2 = height[l];
                    if (cup[l] <= height[l]) {
                        cup[r] = height[r];
                        for (int i = l; i < r; i++) {
                            if (cup[i] <= height[l]) {
                                cup[i] = height[l];
                            }
                        }
                    }
                }
                l++;
            }else if (height[l] == height[r]){
                for (int i = l; i <= r; i++) {
                    if (cup[i] < height[l]) {
                        cup[i] = height[l];
                    }
                }
                l++;
                r--;
            }

            if (r == l){
                if (max == height[l]) {
                    cup[l] = height[l];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += (cup[i] - height[i]);
        }
        for (int n:cup
        ) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println(sum);
        return sum;
    }
}

