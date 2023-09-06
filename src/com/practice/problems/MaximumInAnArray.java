package com.practice.problems;

public class MaximumInAnArray {
    public static void main(String[] args){
        int[] arr = {12, 43, 711, 32, 90};
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
