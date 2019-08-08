package com;

public class 加一 {
    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 1; i--) {
            if (digits[i] > 9) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }
        if (digits[0] > 9) {
            int[] d = new int[digits.length + 1];
            for (int i = 1; i < digits.length; i++) {
                d[i + 1] = digits[i];
            }
            d[1] = digits[0] % 10;
            d[0] = digits[0] / 10;
            return  d;
        }
        return digits;
    }
}
