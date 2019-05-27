package com;

import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = 999, sum = 0;
        String b;
        String[] name = new String[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = scanner.next();
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        int are = sum / n;
        are /= 2;
        b = name[0];
        for (int i = 0; i < n; i++) {
            if (min > Math.abs(a[i] - are)) {
                min = Math.abs(a[i] - are);
                b = name[i];
            }
        }
        System.out.println(are + " " + b);
    }
}
