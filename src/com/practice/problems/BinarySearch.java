package com.practice.problems;

public class BinarySearch{
    public static void main(String[] args){
        System.out.println(BinarySearch.binarySearch(new int[]{2, 3, 6, 7, 9, 10}, 3));
    }
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high - low)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                high = mid-1;
            } else if (arr[mid] < key) {
                low = mid+1;
            }
        }
        return -1;
    }
}