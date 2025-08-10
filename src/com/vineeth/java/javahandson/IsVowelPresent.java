package com.vineeth.java.javahandson;

import java.util.Scanner;

public class IsVowelPresent {
    public static void main(String[] args){
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String value: ");
        String input = scanner.nextLine();
        for(int i =0; i<input.length();i++){
            String ch = String.valueOf(input.charAt(i));
            if("aeiou".contains(ch)){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Vowels are not present");
        }else{
            System.out.println("Vowels are present");
        }
    }
}
