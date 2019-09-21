package PTA.test42;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 2){
            System.out.println(2);
            return;
        }else {
            System.out.print(2 + " ");
        }
        boolean f = false;
        for (int i = 3; i <= n; i+=2) {
            f = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    f = true;
                    break;
                }
            }
            if (!f){
                System.out.print(i + " ");
            }
        }
    }
}