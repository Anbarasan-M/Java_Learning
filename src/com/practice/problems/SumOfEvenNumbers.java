package com.practice.problems;

public class SumOfEvenNumbers {
    public static void main(String[] args){
        int ans = 0;
        int [] arr = {22, 12, 5, 32, 9, 13, 7};
        for (int i = 0; i<arr.length; i++){
            if (arr[i] % 2 == 0){
                ans += arr[i];
            }
        }
        System.out.println(ans);
    }
}
