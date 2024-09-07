package com.vineeth.java;

public class PrintPattern {

    public static void main(String[] args) {

        // 1st pattern
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        // 2nd pattern
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        // 3rd pattern
    }
}
