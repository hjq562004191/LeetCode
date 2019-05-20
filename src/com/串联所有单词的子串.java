package com;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 串联所有单词的子串 {
    public static void main(String[] args) {
        String[] w = new String[2];
        w[0] = "foo";
        w[1] = "bar";
//        w[0] = "word";
//        w[1] = "good";
////        w[2] = "the";
//        w[2] = "best";
//        w[3] = "word";
        findSubstring("barfoothefoobarman", w);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
//        int subnum = words.length;
//        int sum = 0;
//        List<Integer> list = new LinkedList<>();
//        for (int i = 0; i < subnum; i++) {
//            s = s.replaceFirst(words[i],Integer.toString(0));
//            sum = sum + words[i].length()-1;
//        }
//        System.out.println(s);
//        for (int i = 0; i < subnum; i++) {
//            s = s.replaceFirst(words[i],Integer.toString(1));
//        }
//        System.out.println(s);
//        boolean f = true;
//        boolean t = true;
//        int i,j;
//        for (i = 0; i < s.length()-subnum; i++) {
//            if (s.charAt(i) == '0' ){
//                for (j = 0; j < subnum - 1; j++) {
//                    if (s.charAt(i+j+1) != '0'){
//                        f = false;
//                        break;
//                    }
//                    if (f){
//                        list.add(i);
//                    }
//                }
//            }
//            if (s.charAt(i) == '1' ){
//                for (j = 0; j < subnum - 1; j++) {
//                    if (s.charAt(i+j+1) != '1'){
//                        t = false;
//                        break;
//                    }
//                    if (t){
//                        list.add(i+sum);
//                    }
//                }
//            }
//        }
////        System.out.println(list.get(0));
////        System.out.println(list.get(1));
//        return list;
        List<Integer> list = new LinkedList<>();
        if (s.equals("") || words.length == 0) {
            return list;
        }
        int size = words.length;
        int len = words[0].length();
        int num = s.length() - len;
//        System.out.println(size +" " + len + " "+num);
        Map<Integer, String> book = new HashMap<>();
        int k = 0;
        for (int i = 0; i < s.length() - len + 1; i++) {
            book.put(k++, s.substring(i, i + len));
//            System.out.println(i + "" +i+len);
            System.out.println(s.substring(i, i + len));
        }
        HashMap<String, Integer> map = new HashMap<>();
        boolean f;
        for (int i = 0; i < num - (size * len); i++) {
            map.clear();

            for (int j = 0; j < size; j++) {
                f = false;
                for (String w : words
                        ) {
                    if (book.get(i + j).equals(w)) {
                        f = true;
                    }
                }
                if (f && !map.containsKey(book.get(i + j))) {
                    if (j == size - 1) {
                        list.add(i);
                    }
                    map.put(book.get(i + j), j);
                } else
                    break;
            }
        }
        for (Integer a : list
                ) {
            System.out.println(a);
        }
        return list;
    }
}
//    List<Integer> list = new LinkedList<>();
//
//        if (s.equals("")|| words.length == 0){
//                return list;
//                }
//                int size = words.length;
//                int len = words[0].length();
//                int num = s.length()/len;
////        System.out.println(size +" " + len + " "+num);
//                String[] book = new String[num];
//                int k = 0;
//                for (int i = 0; i < s.length(); i+=len) {
//        book[k++] = s.substring(i,i+len);
////            System.out.println(s.substring(i,i+len));
//        }
//        HashMap<String,Integer> map = new HashMap<>();
//        boolean f ;
//        for (int i = 0; i < num-size; i++) {
//        map.clear();
//        for (int j = 0; j < size; j++) {
//        f = false;
//        for (int l = 0; l < size; l++) {
//        if (book[i+j].equals(words[l])){
//        f = true;
//        }
//        }
//        if (f&&!map.containsKey(book[i+j])) {
//        if (j == size - 1){
//        list.add(i*len);
//        }
//        map.put(book[i+j], j);
//        }
//        else
//        break;
//        }
//        }
////        for (Integer a:list
////             ) {
////            System.out.println(a);
////        }
//        return list;