package com.practice.problems;

public class AccSumDifference {
    public static int sumDifference(int n, int m){
        int divisible = 0;
        int non_divisible = 0;
        for(int i=1; i<m+1; i++){
            if(i%4 == 0){
                divisible += i;
            }else{
                non_divisible += i;
            }
        }
        return non_divisible - divisible;
    }
    public static void main(String[] args){
        int result = AccSumDifference.sumDifference(4, 20);
        System.out.println(result);
    }
}