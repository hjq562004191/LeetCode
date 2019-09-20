package PTA.test10;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0,b = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 2 == 0){
                a++;  //偶数
            }
            if (i % 3 == 0 && i % 2 != 0){
                b++;
            }
        }
        System.out.println(b+","+a);
    }
}