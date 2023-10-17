package com.practice.problems;

import java.beans.PropertyEditorSupport;

public class ReduceNumberToZero {
    public static void main(String[] args){
        int result = ReduceNumberToZero.numberOfSteps(14);
        System.out.println(result);
    }
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num!=0){
            if(num%2==0){
                num = num/2;
            }
            else{
                num -= 1;
            }
            count += 1;
        }
        return count;
    }
}
