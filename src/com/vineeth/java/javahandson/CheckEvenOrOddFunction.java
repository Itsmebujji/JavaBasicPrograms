package com.vineeth.java.javahandson;

import java.util.Scanner;

public class CheckEvenOrOddFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the function: ");
        System.out.println("1. Check Odd Number");
        System.out.println("2. Check Even Number");
        String str = scanner.nextLine();
        if(str.equals("1") || str.contains("Odd")){
            System.out.println("Enter the number: ");
            int input = scanner.nextInt();
            oddFunction(input);
        }else{
            System.out.println("Enter the number: ");
            int input = scanner.nextInt();
            evenFunction(input);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Check the even and odd number in list");
        int[] numbers = {1,3,2,5,4,45,65,34,23,76,45,8,5,456,8976,345,67,89,0};
        StringBuilder a = new StringBuilder();
        String b = "";
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]==0){
                System.out.println("O is a not even or odd number");
            }else{
                if(numbers[i]%2==0){
                    a.append(numbers[i]).append(" ");
                }else{
                    b += numbers[i]+" ";
                }
            }
        }
        System.out.println("Even numbers: "+a);
        System.out.println("Odd numbers: "+b);
    }

    private static void evenFunction(int input) {
        if(input%2==0){
            System.out.println(input+" is a even number");
        }else{
            System.out.println(input+" is not a even number");
        }
    }

    private static void oddFunction(int input) {
        if(input%2==1){
            System.out.println(input+" is a odd number");
        }else{
            System.out.println(input+" is not a odd number");
        }
    }
}
