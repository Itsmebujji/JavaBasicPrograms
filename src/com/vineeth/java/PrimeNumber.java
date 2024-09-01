package com.vineeth.java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Finding Prime Number");
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        if(x==0||x==1){
            System.out.println("Not a Prime Number ");
        }else{
            for(int i=2;i<=x;i++){
                int count =0;
                for(int j=2;j<=x;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count>=2){
                    System.out.println("Not a Prime Number "+i);
                }else{
                    System.out.println("Prime Number: "+i);
                }
            }

        }
    }
}
