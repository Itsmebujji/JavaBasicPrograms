package com.vineeth.java.javahandson;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the Option No: ");
        System.out.println("1. Check the number is Prime number");
        System.out.println("2. Provide all prime numbers under given number");
        System.out.println("Enter the Option No: ");
        String str = scanner.nextLine();
        if(str.contains("check") || str.equals("1")){
            System.out.println("Enter the Number: ");
            int input1 = scanner.nextInt();
            isPrime(input1);
        }else{
            System.out.println("Enter the Number: ");
            int input2 = scanner.nextInt();
            allPrimes(input2);
        }
    }
    public static void isPrime(int number){
        int count =0;
        if(number==0 || number==1){
            System.out.println("O or 1 is not a prime numbers");
        } else if (number==2) {
            System.out.println("2 is a prime number");
        }else{
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    count++;
                }
            }
            if(count<1){
                System.out.println(number+" is a prime number");
            }else{
                System.out.println(number+" is a not prime number");
            }
        }
    }
    public static void allPrimes(int number){
        for( int x = 0; x < number; x++){
            int count = 0;
            if(x==0 || x==1){
                System.out.println("O or 1 is not a prime numbers");
            } else if (x==2) {
                System.out.print("Prime numbers: "+x);
            }else{
                for(int i=2;i<=x/2;i++){
                    if(x%i==0){
                        count++;
                    }
                }
                if(count<1){
                    System.out.print(" "+x);
                }
            }
        }
    }
}
