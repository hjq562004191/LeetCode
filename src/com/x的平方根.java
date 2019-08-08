package com;

public class x的平方根 {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        long t = 1;
        while(t*t<=x){
            t+=1;
        }
        return (int)t-1;
    }
}
