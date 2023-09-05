package com.practice.problems;


class SAPSolution{
    public int subtractProductAndSum(int n) {
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
public class SumAndProduct {
    public static void main(String[] args){
        SAPSolution obj = new SAPSolution();
        System.out.println(obj.subtractProductAndSum(234));
    }
}
