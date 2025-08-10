package com.vineeth.java.javahandson;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the one of method: ");
        System.out.println("1. Using loop");
        System.out.println("2. recurring method");
        System.out.println("Enter Method 1 or 2: ");
        String str = scanner.nextLine();
        if(str.contains("1") || str.contains("2")){
            int input = scanner.nextInt();
            fiboSeriesLoop(input);
        }else{
            int input = scanner.nextInt();
            for(int i = 0; i < input; i++){
                System.out.println(fiboSeriesRecur(input)+" ");
            }
        }

    }

    private static int fiboSeriesRecur(int input) {
        if(input<=1){
            return input;
        }
        return fiboSeriesRecur(input-1) + fiboSeriesRecur(input-2);
    }

    public static void fiboSeriesLoop(int input){
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=0;i<input;i++){
            System.out.print(" "+a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
