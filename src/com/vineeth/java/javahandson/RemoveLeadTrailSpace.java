package com.vineeth.java.javahandson;

import java.util.Scanner;

public class RemoveLeadTrailSpace {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String value");
        String str = scanner.nextLine();
        String newStr = str.strip();
        System.out.println(newStr);
    }
}
