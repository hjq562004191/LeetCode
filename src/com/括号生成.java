package com;

import java.util.LinkedList;
import java.util.List;

/**
 *给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 *
 */
public class 括号生成 {
    public static void main(String[] args) {
        generateParenthesis(3);
    }
    public static List<String> generateParenthesis(int n) {
        List<String > list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        DFS(list,n,sb,0);
        return list;
    }
    private static void DFS(List<String> list, int n,StringBuilder sb1,int start) {
        StringBuilder sb = new StringBuilder(sb1);
        if (sb.length() == n*2){
            list.add(sb.toString());
            System.out.println(sb.toString());
            return;
        }
        for (int i = start; i < n; i++) {
            sb.append("(");
            DFS(list,n,sb,i+1);
            sb.deleteCharAt(sb.length()-1);
            sb.append(")");
            DFS(list,n,sb,i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
