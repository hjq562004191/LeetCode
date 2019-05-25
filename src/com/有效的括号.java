package com;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 * @author Qiang
 * @data 2019/5/25/16:32
 */
public class 有效的括号 {
    public static void main(String[] args) {
        boolean f = isValid("()[]{}");
        System.out.println(f);
    }
    public static boolean isValid(String s) {
        if (s.length()%2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.peek() == ')' ||stack.peek() == '}' ||stack.peek() == ']' ){
                return false;
            }else if (s.charAt(i) == ')'){
                if (stack.peek() == '('){
                    stack.pop();
                }else {
                    return false;
                }
            }else if (s.charAt(i) == ']'){
                if (stack.peek() == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }else if (s.charAt(i) == '}'){
                if (stack.peek() == '{'){
                    stack.pop();
                }else {
                    return false;
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.empty()) {
            return true;
        }else {
            return false;
        }
    }
}
