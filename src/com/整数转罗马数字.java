package com;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashMap;
import java.util.Map;

/**
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 3
 * 输出: "III"
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "IV"
 * 示例 3:
 * <p>
 * 输入: 9
 * 输出: "IX"
 * 示例 4:
 * <p>
 * 输入: 58
 * 输出: "LVIII"
 * 解释: L = 50, V = 5, III = 3.
 * 示例 5:
 * <p>
 * 输入: 1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class 整数转罗马数字 {
    public static void main(String[] args) {
        String s = intToRoman(20);
        System.out.println(s);
    }

    public static String intToRoman(int num) {
        String s = "";
        int t = 0;
        if (num / 1000 > 0) {
            t = num / 1000;
            for (int i = 0; i < t; i++) {
                s += "M";
                num -= 1000;
            }
        }
        if (num >= 900) {
            s += "CM";
            num -= 900;
        }
        if (num >= 500) {
            s += "D";
            num -= 500;
        }
        if (num >= 400) {
            s += "CD";
            num -= 400;
        }
        if (num >= 100) {
            int p = num / 100;
            for (int i = 0; i < p; i++) {
                s += "C";
                num -= 100;
            }

        }
        if (num >= 90) {
            s += "XC";
            num -= 90;
        }
        if (num >= 50) {
            s += "L";
            num -= 50;
        }
        if (num >= 40) {
            s += "XL";
            num -= 40;
        }
        if (num >= 10) {
            int p = num / 10;
            for (int i = 0; i < p; i++) {
                s += "X";
                num -= 10;
            }
        }
        if (num >= 9) {
            s += "IX";
            num -= 9;
        }
        if (num >= 5) {
            s += "V";
            num -= 5;
        }
        if (num >= 4) {
            s += "IV";
            num -= 4;
        }
        while (num != 0) {
            s += "I";
            num -= 1;
        }

        return s;
    }
}
