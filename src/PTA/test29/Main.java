package PTA.test29;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s = "*";
        for (int i = 1; i <= N; i++) {
            System.out.println(s);
            s+="*";
        }
    }
}