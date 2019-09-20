package PTA.test3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        while (scanner.hasNext()){
            m = scanner.nextInt();
            printGradeInfo(getGrade(m));
        }
    }
    public static Grade getGrade(int score){
        if(score>=90&&score<=100){
            System.out.println("Excellent");
            return Grade.A;
        }
        else if(score>=80&&score<90){
            System.out.println("Good");
            return Grade.B;
        }
        else if(score>=70&&score<80){
            System.out.println("Average");
            return Grade.C;
        }
        else if(score>=60&&score<70){
            System.out.println("Fair");
            return Grade.D;
        }
        else {
            System.out.println("Poor");
            return Grade.E;
        }
    }
    public static void printGradeInfo(Grade grade){
        System.out.println("class name="+Grade.class);
        System.out.println("grade value="+grade);
    }
}
enum  Grade{
    A,B,C,D,E
}
