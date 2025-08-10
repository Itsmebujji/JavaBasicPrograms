package com.vineeth.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    // Arrays introduced because of variable limitations. Arrays will store more elements then variables
    // Arrays dont have inbuilt(no ready made methods) operations to access, modify, remove or delete that is the
    // limitations for the arrays. One more thing is size constraint also.
    // but these are better in performance wise

    public static void main(String[] args){
        Integer[] arr = new Integer[]{10,11,31,45,55};
        Integer[] arr1 = new Integer[]{10,11,31,45,55};
        List<Integer> lst = Arrays.asList(arr);
        System.out.println(lst);
        int index = Arrays.binarySearch(arr1,10);
        System.out.println(index);
        Arrays.sort(arr1);
    }
}
