package com.vineeth.java.javahandson;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args){
        int[] input ={2,1,4,34,23,12,45,76,35,76,43,56,54,28,20,31,89};
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
    }
}
