package com;

public class 字符串转换整数atoi {
    public static void main(String[] args) {
        int a = myAtoi("2");
        System.out.println(a);
    }
    public static int myAtoi(String str) {
        if (str == "")
            return 0;
        String s = "";
        int len = str.length();
        boolean f = false;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i)<= '9'){
                s = str.substring(i);
                break;
            }
            if (str.charAt(i) == '+'){
                s = str.substring(i+1);
                break;
            }
            if (str.charAt(i) == ' '){
                continue;
            }else if (str.charAt(i) == '-'){
                f = true;
                s = str.substring(i+1);
                break;
            }else {
                return 0;
            }
        }
        System.out.println(s);
        long num  = 0;
        if (f == true) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num *= 10;
                    num += (s.charAt(i) - '0');
                    if (num > Math.pow(2, 31)) {
                        return -2147483648;
                    }
                } else {
                    break;
                }
            }
            return -1 * (int)num;
        }else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num *= 10;
                    num += (s.charAt(i) - '0');
                    if (num > Math.pow(2, 31) - 1) {
                        return 2147483647;
                    }
                } else {
                    break;
                }
            }
            return (int)num;
        }
    }
}
