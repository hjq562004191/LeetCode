package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
 * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * 返回所有不常用单词的列表。
 * 您可以按任何顺序返回列表。
 * 示例 1：
 *
 * 输入：A = "this apple is sweet", B = "this apple is sour"
 * 输出：["sweet","sour"]
 * 示例 2：
 *
 * 输入：A = "apple apple", B = "banana"
 * 输出：["banana"]
 *
 * 0 <= A.length <= 200
 * 0 <= B.length <= 200
 * A 和 B 都只包含空格和小写字母。
 */
public class 两句话中的不常见单词 {
    public static void main(String[] args) {
        uncommonFromSentences("this apple is sweet","this apple is sour");
    }
    public static String[] uncommonFromSentences(String A, String B) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])){
                map.put(a[i],0);
            }else {
                map.put(a[i],1);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i])){
                map.put(b[i],0);
            }else {
                map.put(b[i],1);
            }
        }
        int k = 0;
        String s = "";
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
           if (entry.getValue() == 0){
               s =  s + entry.getKey() + " ";
           }
        }

        if (s.equals("")){
            String[] result = new String[0];
            return result;
        }
        String[] result = s.split(" ");
        return result;
    }
}
