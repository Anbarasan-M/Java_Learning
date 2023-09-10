package com.practice.problems;

public class AccSumOfSecondLargestAndSecondSmallest {
    public static void main(String[] args){

        int nums[] = {12, 5, 3, 89, 0, 5};
        int largest = Integer.MIN_VALUE;
        int second_largest = largest;

        for(int num:nums){
            if(num > largest){
            second_largest = largest;
            largest = num;}
        }
        System.out.println(second_largest);
    }
}
