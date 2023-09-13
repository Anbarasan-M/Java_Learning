package com.practice.problems;

public class AccCarrySum {
    public static void main(String[] args){
        int num1 = 283;
        int num2 = 563;
        int count = 0;

        while(num1 !=0 && num2 !=0){
            int rem1 = num1%10;
            int rem2 = num2%10;

            num1/=10;
            num2/=10;

            if(rem1+rem2 > 9){
                count += 1;
                num1 += (rem1+rem2) - 9;
            }

        }
        System.out.println(count);
    }
}
