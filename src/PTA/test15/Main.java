package PTA.test15;

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x, j = 1;
        x = in.nextInt();
        switch (x) {
            case 1:
                j++;break;
            case 2:
                j++;break;
            case 3:
                j = x*j++;break;
            case 4:
                j= x + j++;break;
            case 5:
                j = x - j++;break;
            default:
                j = x;break;
        }
        System.out.println(j);
    }
}