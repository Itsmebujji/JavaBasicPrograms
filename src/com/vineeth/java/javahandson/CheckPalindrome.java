package com.vineeth.java.javahandson;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string value: ");
        String input = scanner.nextLine();
        checkPalindrome(input.toLowerCase());
    }

    private static void checkPalindrome(String input) {
        System.out.println("--------------Method1--------------");
        String str ="";
        for(int i=input.length()-1; i>=0;i--){
            str+=input.charAt(i);
        }
        if(str.equals(input)){
            System.out.println(input+" is a palindrome");
        }else{
            System.out.println(input+" is not a palindrome");
        }

        System.out.println("--------------Method2--------------");
        boolean flag = true;
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(input+" is a palindrome");
        }else{
            System.out.println(input+" is not a palindrome");
        }
    }
}
