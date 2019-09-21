package PTA.test46;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String t = "";
        while (scanner.hasNext()){
            String s = scanner.next();
            if (s.equals("end")){
                break;
            }
            if (s.length() % 3 == 0){
                t+=s;
                t += " ";
            }
        }
        System.out.println(t);
    }
}