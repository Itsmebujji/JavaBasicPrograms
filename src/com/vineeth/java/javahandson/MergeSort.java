package com.vineeth.java.javahandson;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] input = new int[10];
        Random random = new Random();
        for(int i=0;i<input.length;i++){
            input[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(input));
        mergeSort(input);
        System.out.println("Print after sorting");
        System.out.println(Arrays.toString(input));
    }

    public static void mergeSort(int[] input){
        if(input.length<2){
            return;
        }
        int mid = input.length/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[input.length-mid];

        for(int i=0;i<leftHalf.length;i++){
            leftHalf[i] = input[i];
        }
        for(int i=mid;i<input.length;i++){
            rightHalf[i-mid] = input[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(input,leftHalf,rightHalf);
    }

    private static void merge(int[] input, int[] leftHalf, int[] rightHalf) {
        int rightSize = rightHalf.length;
        int leftSize = leftHalf.length;

        int i=0;
        int j=0;
        int k=0;
        while(i<leftSize && j<rightSize){  ///  70   50 60
            if(leftHalf[i]<=rightHalf[j]){
                input[k] = leftHalf[i];
                i++;
            }else{
                input[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            input[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j<rightSize){
            input[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
