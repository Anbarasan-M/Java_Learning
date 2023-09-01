package com.practice.problems;

class BSSolution {
    public int binarySearch(int[] arr, int key){
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
public class BinarySearch{
    public static void main(String[] args){
        BSSolution obj = new BSSolution();
        System.out.println(obj.binarySearch(new int[]{2, 3, 6, 7, 9, 10}, 3));
    }
}