package com;

import java.util.Arrays;

/**
 * CCF真题
 */
public class 碰撞的小球 {
    public static void main(String[] args) {
        int n = 10;
        int L = 22;
        int t = 30;
        int[] num = {14,12,16,6,10,2,8,20,18,4};
        int[] num1 = num.clone();
        Arrays.sort(num);
        int[] sort = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (num[i] == num1[j]){
                    sort[j] = k++;
                }
            }
        }
        int[] step = new int[n];
        for (int i = 0; i < n; i++) {
            if (num[i] != L){
                step[i] = 1;
            }else {
                step[i] = -1;
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n; j++) {
                num[j] = num[j] + step[j];
            }
            for (int j = 0; j < n - 1; j++) {
                if (num[j] == num[j+1]){
                    step[j] = step[j] * -1;
                    step[j+1] = step[j+1] * -1;
                }
            }
            if (num[n-1] >= L){
                step[n-1] = step[n-1] * -1;
            }
            if (num[0] == 0){
                step[0] = step[0] * -1;
            }
        }
        for (int i = 0; i < n; i++) {
//            System.out.print(sort[i] + " ");
////            System.out.println();
            System.out.print(num[sort[i]] + " ");
        }
    }
}
