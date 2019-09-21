package PTA.test45;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ou = 0;
        int ji = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 2 == 0){
                ou += a;
            }else {
                ji +=a;
            }
        }
        System.out.println("奇数和="+ji + ", "+"偶数和="+ou);
    }
}