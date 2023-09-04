package com.practice.problems;

public class ArmstrongNumber {
    public static void main(String[] args){
        int num = 371;
        int org = num;
        int count = 0;
        while (num != 0){
            num = num/10;
            count +=1;
        }
        int ans = 0;
        num = org; // Reset num to the original value
        while (org != 0) {
            int dig = org % 10;
            ans += Math.pow(dig, count); // Calculate dig^count and add to ans
            org = org / 10;
        }

        // Check if the number is an Armstrong number
        if (ans == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
