package PTA.test28;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean f = false;
        for (int i = 1; i <= 100; i++) {
            if ((a + i ) % 10 == 3 ||(a + i ) % 10 == 6 ||(a + i ) % 10 == 9 ){
                if ((b + i ) % 10 == 3 ||(b + i ) % 10 == 6 ||(b + i ) % 10 == 9 ){
                    if ((c + i ) % 10 == 3 ||(c + i ) % 10 == 6 ||(c + i ) % 10 == 9 ){
                        System.out.println(i);
                        f = true;
                        break;
                    }
                }
            }
        }
        if (!f){
            System.out.println("so sad!");
        }
    }
}