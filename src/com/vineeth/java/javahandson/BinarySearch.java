package com.vineeth.java.javahandson;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        // Binary search only work on the sorted array
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int[] searchElements = {10,20,30,40,50,60,70,80,90,100};
        int low = 0;
        int high = searchElements.length-1;
        boolean isFound = false;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(searchElements[mid]==target){
                System.out.println("Element("+searchElements[mid]+") is Found at index: "+mid);
                isFound = true;
                break;
            } else if (searchElements[mid]<target) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(!isFound){
            System.out.println("Element("+target+") is Not Found");
        }
    }
}
