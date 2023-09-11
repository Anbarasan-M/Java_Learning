package com.practice.problems;

public class AccSumOfSecondLargestAndSecondSmallest {
    public static void main(String[] args){
        int[] arr = {13, 5, 7, 22, 1, 9, 10};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j > max) {
                second_max = max;
                max = j;
            } else if (j > second_max && j != max) {
                second_max = j;
            }

            if (j < min) {
                second_min = min;
                min = j;
            } else if (j < second_min && j != min) {
                second_min = j;
            }
        }
        System.out.println(second_min + second_max);
    }
}
