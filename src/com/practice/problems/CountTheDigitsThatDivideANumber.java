package com.practice.problems;

public class CountTheDigitsThatDivideANumber {
    public static void main(String[] args){

        int result = CountTheDigitsThatDivideANumber.countDigits(1248);
        System.out.println(result);
    }
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while(num!=0){
            int mod = num%10;
            if(temp%mod == 0){
                count += 1;
            }
            num = num/10;
        }
        return count;
    }
}
