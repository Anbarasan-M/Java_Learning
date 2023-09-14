package com.practice.problems;

public class AccCalculateThreeAndFiveDivisible {
    public static void main(String[] args){

    int m = 12;
    int n = 50;

    int result = 0;

    for(int i=m; i<=n; i++) {

        if(i%3==0 && i%5==0){
            result += i;
        }
    }
    System.out.println(result);
    }
}
