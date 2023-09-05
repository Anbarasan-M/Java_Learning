package com.practice.problems;
class CTDTDANSolution{
    public int countDigits(int num) {
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
public class CountTheDigitsThatDivideANumber {
    public static void main(String[] args){

        CTDTDANSolution obj = new CTDTDANSolution();
        int result = obj.countDigits(1248);
        System.out.println(result);
    }
}
