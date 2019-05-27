package com;

import java.util.Scanner;

public class 疼讯面试题1 {
    public static void main(String[] args) {
        int n, x, t;
        int[] s = new int[1005];
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        n = scanner.nextInt();
        int i, sum = 0, ans = 0;
        for (i = 1; i <= n; i++) {
            s[i] = scanner.nextInt();
        }
        for (int j = 1; j < n + 1; j++) {
            for (int k = j + 1; k < n + 1; k++) {
                if (s[j] > s[k]) {
                    t = s[j];
                    s[j] = s[k];
                    s[k] = t;
                }
            }
        }
        if (s[1] != 1) {
            System.out.println(-1);
            return;
        }
        while (true) {
            if (sum >= x) {
                System.out.print(ans);
                return;
            }
            for (i = n; i >= 1; i--)
                if (s[i] <= sum + 1) {
                    sum += s[i];
                    ans++;
                    break;
                }
        }
    }
}

