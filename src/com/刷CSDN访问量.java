package com;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class 刷CSDN访问量 {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/88957852");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/88779813");
//        list.add("https://blog.csdn.net/qq_42347755/article/details/86554939");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/88726548");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/88427394");
//        list.add("https://blog.csdn.net/qq_42347755/article/details/83004839");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/88427220");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/80657932");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/80657989");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/87637470");
//        list.add("https://blog.csdn.net/qq_42347755/article/details/84928943");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/83448748");
//        list.add("https://blog.csdn.net/qq_42347755/article/details/84928680");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/89043642");
////        list.add("https://blog.csdn.net/sinat_41905822/article/details/81772299");
//        list.add("https://blog.csdn.net/qq_42347755/article/details/84929590");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/81186472");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/80631484");
//        list.add("https://blog.csdn.net/qq_42347755/article/details/85225508");
////        list.add("https://blog.csdn.net/sinat_41905822/article/details/80630846");
////        list.add("https://blog.csdn.net/sinat_41905822/article/details/88600503");
//        list.add("https://blog.csdn.net/sinat_41905822/article/details/88981871");
        list.add("https://blog.csdn.net/sinat_41905822/article/details/81454709");
        list.add("https://blog.csdn.net/sinat_41905822/article/details/89043642");
        list.add("https://blog.csdn.net/sinat_41905822/article/details/88981871");
        list.add("https://blog.csdn.net/sinat_41905822/article/details/80657932"); //博客地址
        list.add("https://blog.csdn.net/qq_42347755/article/details/89112506");
        list.add("https://blog.csdn.net/qq_42347755/article/details/89057135");
        int i = list.size();
        int j = 0;
        while (true) {
            try {
                URL url = new URL(list.get(j % i));

                URLConnection URLconnection = url.openConnection();
                HttpURLConnection httpConnection = (HttpURLConnection) URLconnection;
                int responseCode = httpConnection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    System.err.println("成功:" + (j + 1));
                    j++;
                    InputStream in = httpConnection.getInputStream();
                    InputStreamReader isr = new InputStreamReader(in);
                    BufferedReader bufr = new BufferedReader(isr);
                    bufr.close();
                } else {
                    System.err.println("失败");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (j % i == i - 1) {
                System.out.println("睡眠1分钟");
                Thread.sleep(1000 * 60); //睡眠1分钟
            }
        }
    }
}
