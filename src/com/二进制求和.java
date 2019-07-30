package com;

import java.util.Stack;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 二进制求和 {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
    public static String addBinary(String a, String b) {
        int i = 0;
        StringBuilder s = new StringBuilder();
        if (a.length() > b.length()) {
            int j;
            for (j = 0; j < a.length() - b.length(); j++) {
                s.append(a.charAt(j));
            }
            for (int k = 0; k < b.length(); k++) {
                s.append((char) (a.charAt(j+k) + b.charAt(k) - '0'));
            }
        }else {
            int j;
            for (j = 0; j < b.length() - a.length(); j++) {
                s.append(b.charAt(j));
            }
            for (int k = 0; k < a.length(); k++) {
                s.append((char) (b.charAt(j+k) + a.charAt(k) - '0'));
            }
        }

        int r = 0;
        for (int j = s.length()-1; j >= 0; j--) {
            if ((char)(s.charAt(j) + r) >= '2') {
                char c = (char) (s.charAt(j)-2 + r);
                s.setCharAt(j,c);
                r = 1;
            }else {
                char c =(char) (s.charAt(j) + r);
                s.setCharAt(j, c);
                r = 0;
            }
        }
        if (r == 1) {
            return "1" + s.toString();
        }else {
            return s.toString();
        }
    }
}
