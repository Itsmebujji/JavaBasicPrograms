package com.vineeth.java.javahandson;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the Factorial of a number");
        System.out.println("Enter the number: ");
        int input = scanner.nextInt();
        System.out.println("The factorial of "+input+": "+factorial(input));
    }
    public static int factorial(int input){
        if(input==1){
            return 1;
        }
        return input*factorial(input-1);
    }
}
