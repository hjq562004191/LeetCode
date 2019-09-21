package PTA.test44;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1){
            System.out.println('a');
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print((char) ('a' + i) + " ");
        }
        for (int i = n-2; i >= 0; i--) {
            if (i == 0){
                System.out.print((char) ('a' + i));
            }else {
                System.out.print((char) ('a' + i) + " ");
            }
        }
    }
}