package com;

/**
 * @author Qiang
 * @data 2019/5/27/21:10
 */
public class 实现strStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello",  "ll"));
    }
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")){
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
