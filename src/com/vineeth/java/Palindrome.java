package com.vineeth.java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //  Method - 1 for both strings and numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String str = "";
        for(int i=s.length()-1;i>=0;i--){
            char[] ch = s.toCharArray();
            str += ch[i];
        }
        System.out.println(str);
        if(str.equals(s)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

        // Method - 2 this only for numbers
//        int r,sum=0,temp;
//        int x = Integer.parseInt(s);
//        temp = x;
//         while(x>0){
//             r = x%10;
//             sum=(sum*10)+r;
//             x = x/10;
//         }
//         if(temp==sum){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not a palindrome");
//         }
    }
}
