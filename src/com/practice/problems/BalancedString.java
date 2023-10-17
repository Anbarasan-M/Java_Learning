package com.practice.problems;

public class BalancedString {
    public static void main(String[] args){

        System.out.println(BalancedString.balancedStringSplit("LLRRLRRLL"));
    }
    public static int balancedStringSplit(String s) {
        int count = 0;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                count += 1;
            }
            else{
                count -= 1;
            }
            if (count == 0){
                res += 1;
            }
        }
        return res;
    }
}
