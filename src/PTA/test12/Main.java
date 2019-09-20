package PTA.test12;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 12){
            System.out.println("请重新输入月份");
        }else {
            String[] strings = {"一月份", "二月份", "三月份", "四月份", "五月份", "六月份",
                    "七月份", "八月份", "九月份", "十月份", "十一月份", "十二月份"};
            System.out.println(strings[n]);
        }
    }
}