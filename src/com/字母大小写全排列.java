package com;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 * 示例:
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * 输入: S = "3z4"
 * 输出: ["3z4", "3Z4"]
 *
 * 输入: S = "12345"
 * 输出: ["12345"]
 * 注意：
 *
 * S 的长度不超过12。
 * S 仅由数字和字母组成。
 */
public class 字母大小写全排列 {
    public static void main(String[] args) {
        letterCasePermutation("v9Iz4guw1e6");
    }
    public static List<String> letterCasePermutation(String S) {
        List<String> list = new LinkedList<>();
        int len = S.length();
        StringBuilder sb = new StringBuilder();
        int[] map = new int[len];
        DFS(list,0,S,sb);
        return list;
    }

    private static void DFS(List<String> list, int start, String s,StringBuilder sb1) {
        StringBuilder sb = new StringBuilder(sb1);
        char c;
        if (sb.length() == s.length()){
                list.add(sb.toString());
                System.out.println(sb.toString());
                return;
        }
            if (s.charAt(start) >= '0' && s.charAt(start) <= '9'){
                sb.append(s.charAt(start));
                DFS(list,start+1,s,sb);
            } else {
                sb.append(s.charAt(start));
                DFS(list,start+1,s,sb);
                sb.deleteCharAt(sb.length()-1);
                c = change(s.charAt(start));
                sb.append(c);
                DFS(list,start+1,s,sb);
            }
    }
    private static char change(char c){
        if (c >= 'a' && c <= 'z')
            c = (char) (c - 32);
        else
            c = (char) (c + 32);
        return c;
    }
}
