package com.vineeth.java.javahandson;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        reverseString(input); // using the loop
        reverseStr(input); // using StringBuilder
    }

    private static void reverseStr(String input) {
        StringBuilder str = new StringBuilder(input).reverse();
        System.out.println("Reverse the String using the string builder: "+str);
    }

    public static void reverseString(String input){
        char[] charArr = input.toCharArray();
        String rstr = "";
        for(int i=charArr.length-1;i>=0;i--){
            rstr += charArr[i];
        }
        System.out.println("Reverse the String using the loop: "+rstr);
    }


}
