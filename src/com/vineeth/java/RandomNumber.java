package com.vineeth.java;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        // Generate random six digit number

        int arr[] = {1,2,3,4,5,6,7,8,9};
        Random rand = new Random();
        String s ="";
        int y=0;
        for(int i = 0; i < arr.length; i++){
            int x = rand.nextInt(9-0+1)+0;
            if(x<9){
                y = (int) Math.floor(Math.random()*arr[x]);
            }
            if(s.length()!=6){
                s += y;
            }
        }
        System.out.println("Random Generated Six Digit Number: "+s);

        // Get random number in range ex: 1 to 100
        // rand.nextInt(max-min+1)+min;
        int max=100;
        int min=1;
        int x = rand.nextInt(max-min+1)+min;
        System.out.println("Randome number in between 1 to 100: "+x);


    }
}
