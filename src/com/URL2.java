package com;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class URL2 {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        list.add("https://blog.csdn.net/sinat_41905822");

        int i = list.size();
        int j = 0;
        String string = "";
        while (true) {
            try {
                URL url = new URL(list.get(j%i));

                URLConnection URLconnection = url.openConnection();
                HttpURLConnection httpConnection = (HttpURLConnection) URLconnection;
                int responseCode = httpConnection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    System.err.println("成功:"+(j+1));
                    j++;
                InputStream in = httpConnection.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader bufr = new BufferedReader(isr);

                while (bufr.readLine() != null){
                    string += bufr.readLine() + "\n";
                }

                bufr.close();
                } else {
                    System.err.println("失败");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(string);
            if (j%i == i-1){
                    System.out.println("睡眠1分钟");
                    Thread.sleep(1000*60); //睡眠1分钟
                }
        }
    }
}
