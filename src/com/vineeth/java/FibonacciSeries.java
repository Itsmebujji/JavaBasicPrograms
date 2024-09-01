package com.vineeth.java;

import java.util.Scanner;

public class FibonacciSeries {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fabonacci Series");
        System.out.println("Enter the Number for Fabonacci Series: ");
        int x = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" "+b);
        for(int i = 0; i < x; i++){
            c = b + a;
            a = b;
            b = c;
            System.out.print(" "+c);
        }
        sc.close();
    }
}
