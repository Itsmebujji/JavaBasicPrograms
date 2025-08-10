package com.vineeth.java.javahandson;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        int a = 30;
        int b = 50;
        System.out.println("--------------------------------------");
        System.out.println("Values of A and B is "+a+" & "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Values of A and B after swap using arithmetic logic is "+a+" & "+b);
        System.out.println("--------------------------------------");
        System.out.println("Values of A and B is "+a+" & "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Values of A and B after swap using binary logic is "+a+" & "+b);
        System.out.println("--------------------------------------");
    }
}
