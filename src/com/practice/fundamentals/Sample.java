package com.practice.fundamentals;

public class Sample{

    public static void mergeSort(int[] arr){

        if(arr == null || arr.length <= 1){
            return;
        }
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, temp, 0, n-1);
    }

    private static void mergeSortHelper(int[] arr, int[] temp, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSortHelper(arr, temp, low, mid);
            mergeSortHelper(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high){

        for(int i=low; i<=high; i++){
            temp[i] = arr[i];
        }

        int i = low;
        int j = mid+1;
        int k = low;

        while(i<=mid && j<=high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args){
        int[] arr = {2, 9, 4, 1, 0, 5, 3};
        mergeSort(arr);
        for(int n:arr){
            System.out.print(n);
        }
    }

}