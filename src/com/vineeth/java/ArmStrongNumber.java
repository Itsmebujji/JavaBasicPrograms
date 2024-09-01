package com.vineeth.java;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = sc.nextLine();
        char[] ch = number.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            int y = Integer.parseInt(String.valueOf(ch[i]));
            sum +=  (int) Math.pow(y, number.length());
        }
        System.out.println("The sum of the digits is " + sum);
        if(number.equals(String.valueOf(sum))){
            System.out.println("This is ArmStrong number");
        }else{
            System.out.println("This is not ArmStrong number");
        }
    }
}
