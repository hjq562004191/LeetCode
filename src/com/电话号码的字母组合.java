package com;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 * @author Qiang
 */
public class 电话号码的字母组合 {
    public static void main(String[] args) {
        letterCombinations("");
    }
    public static List<String> letterCombinations(String digits) {
        List<String> lists = new LinkedList<>();
        if (digits.length() == 0) {
            return lists;
        }
        String[][] strings = new String[10][4];
        strings[2] = new String[]{"a", "b", "c"};
        strings[3] = new String[]{"d", "e", "f"};
        strings[4] = new String[]{"g", "h", "i"};
        strings[5] = new String[]{"j", "k", "l"};
        strings[6] = new String[]{"m", "n", "o"};
        strings[7] = new String[]{"p", "q", "r","s"};
        strings[8] = new String[]{"t", "u", "v"};
        strings[9] = new String[]{"w", "x", "y","z"};

        for (int i = 0; i < strings[digits.charAt(0) - '0'].length; i++) {
                StringBuilder s = new StringBuilder("");
                s .append(strings[digits.charAt(0) - '0'][i]);
                DFS(lists,strings,digits,s,0);
                s.deleteCharAt(s.length()-1);
        }
        for (String s2:lists
             ) {
            System.out.println(s2);
        }
        return lists;
    }

    private static void DFS(List<String> lists, String[][] strings, String digits, StringBuilder s,int p) {

        if (s.length() == digits.length()){
            String s1 = "" +s;
            lists.add(s1);
            return;
        }

        for (int i = 0; i < strings[digits.charAt(p+1) - '0'].length; i++) {

            s.append(strings[digits.charAt(p+1) - '0'][i]);
            DFS(lists,strings,digits,s,p+1);
            s.deleteCharAt(s.length()-1);
        }
    }

}
