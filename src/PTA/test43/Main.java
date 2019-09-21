package PTA.test43;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int count = 0 ;
        while (scanner.hasNextInt()){
            if (scanner.nextInt() > max){
                count++;
            }
        }
        System.out.println(count);
    }
}