package com.vineeth.java;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Factorial Number: ");
        int n = sc.nextInt();
        int x=1;
        for(int i = n; i>1; i--){
            x = x*i;
        }
        System.out.println(x);

        // Method - 2
//        int x = factorial(4);
//        System.out.println(x);
    }

    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }


}
