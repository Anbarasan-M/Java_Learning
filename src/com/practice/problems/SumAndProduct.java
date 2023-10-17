package com.practice.problems;

public class SumAndProduct {
    public static void main(String[] args){
        System.out.println(SumAndProduct.subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        while(n!=0){
            int num = n%10;
            sum += num;
            mul *= num;
            n = n/10;
        }
        return mul - sum;
    }
}
