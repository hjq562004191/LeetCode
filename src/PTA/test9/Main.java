package PTA.test9;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String s,a = "",b="";
            int sum = 0;
            s = scanner.nextLine();
            int i,j = 0;
            boolean f= false;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' '){
                    a+=s.charAt(i);
                    f = true;
                }else if (f == true){
                    j = i;
                    break;
                }
            }

            for (j = i; j < s.length(); j++) {
                if (s.charAt(j) != ' '){
                    b+=s.charAt(j);
                }
            }

            System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        }
    }
}