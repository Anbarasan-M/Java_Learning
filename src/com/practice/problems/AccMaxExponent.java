package com.practice.problems;

public class AccMaxExponent {
    public static void main(String[] args){

        int num1 = 7;
        int num2 = 13;

        int max_num = 0;
        int max_exponent = 0;

        for(int i=num1; i<=num2; i++){

            int current_num = i;
            int exponent = 0;

            while(current_num%2 == 0){
                current_num/=2;
                exponent += 1;
            }

            if(exponent > max_exponent){

                max_exponent = exponent;
                max_num = i;
            }

        }
        System.out.println(max_num);
    }
}
