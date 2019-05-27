package com;

import java.util.Scanner;

public class 最长回文 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println(longestPalindrome(s1));
    }

    public static String longestPalindrome(String s) {
        int max = 0;
        int maxk = 0;
        int length = s.length();
        String[] str = new String[999999];
        int k = 0;
        if (s.equals("")) {
            return "";
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length + 1; j++) {
                str[k] = s.substring(i, j);
                boolean f = true;
                int l = j - i;
                if (l % 2 == 1) {   //基数
                    int mid = l / 2;
                    for (int q = 1; q <= (l - 1) / 2; q++) {
                        if (str[k].charAt(mid - q) != str[k].charAt(mid + q)) {

                            f = false;
                        }
                    }
                } else {   //偶数

                    int midl = l / 2 - 1;
                    int midr = l / 2;
                    for (int q = 0; q < l / 2; q++) {
                        if (str[k].charAt(midl - q) != str[k].charAt(midr + q)) {
                            f = false;
                        }
                    }
                }
                if (str[k].length() > max && f) {
                    maxk = k;
                    max = str[k].length();
                }
                k++;
            }
        }
        return str[maxk];
    }
}
