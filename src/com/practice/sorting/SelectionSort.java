package com.practice.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String [] args){
        int[] arr = {32, 4, 1, 6, 2, 0, 9};
        for(int i = 0; i<arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
