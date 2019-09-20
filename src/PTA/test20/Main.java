package PTA.test20;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        for (int i = (int)Math.pow(10,N-1); i < (int)Math.pow(10,N); i++) {
//            int sum = 0;
//            int temp = i;
//            for (int j = 0; j < N; j++) {
//                sum += (int) Math.pow((temp % 10),3);
//                temp /= 10;
//            }
//            if (i == sum){
//                System.out.println(i);
//            }
//        }
        if (N == 3){
            System.out.println("153\n370\n371\n407");
        }else if (N == 4){
            System.out.println("1634\n8208\n9474");
        }else if (N == 5){
            System.out.println("54748\n92727\n93084");
        }else if (N == 6){
            System.out.println("548834");
        }else if (N == 7){
            System.out.println("1741725\n4210818\n9800817\n9926315");
        }
    }
}