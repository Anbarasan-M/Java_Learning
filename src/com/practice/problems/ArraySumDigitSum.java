package com.practice.problems;

public class ArraySumDigitSum {
    public static void main(String[] args){
        int result = ArraySumDigitSum.differenceOfSum(new int []{1, 15, 6, 3});
        System.out.println(result);
    }
    public static int differenceOfSum(int[] nums) {
        int arraySum = 0;
        int digitSum = 0;
        for(int number : nums){
            arraySum += number;
            while (number != 0) {
                int digit = number % 10;
                digitSum += digit;
                number /= 10;
            }
        }
        return (arraySum - digitSum);
    }
}
