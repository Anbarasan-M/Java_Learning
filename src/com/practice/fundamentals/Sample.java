package com.practice.fundamentals;

import java.util.Arrays;
public class Sample{
    public static void main(String[] args){

    }
}
//class QuickSort{
//    public static void main(String[] args){
//        int[] arr = {3, 1, 6, 9, 2, 7, 4};
//        int low = 0;
//        int high = arr.length -1;
//        quickSort(arr, low, high);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void quickSort(int[] arr, int low, int high){
//        if(low<high){
//            int partitionIndex = partition(arr, low, high);
//            quickSort(arr, low, partitionIndex-1);
//            quickSort(arr, partitionIndex+1, high);
//        }
//    }
//    public static int partition(int[] arr, int low, int high){
//        int pivot = arr[high];
//        int i = low - 1;
//        for(int j = low; j<high; j++){
//            if(arr[j] < pivot){
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        int temp = arr[i+1];
//        arr[i+1] = high;
//        arr[high] = temp;
//        return i+1;
//    }
//}