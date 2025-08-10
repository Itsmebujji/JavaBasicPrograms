package com.vineeth.java.javahandson;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String value: ");
        String str = scanner.nextLine();
        String newStr = str.replace(" ", "");
        System.out.println(newStr);
    }
}
