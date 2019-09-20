package PTA.test13;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a*a + b*b <= 100){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}