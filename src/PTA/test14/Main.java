package PTA.test14;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        int d = 0;
        if (m != 2) {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    d = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    d = 30;

            }
        }else if (((y % 4 == 0) && (y % 100 != 0)) || y % 400 == 0) {
                d = 29;
            } else {
                d = 28;
            }
        System.out.println(d);
    }
}