package com.practice.problems;

public class FindingMaximumInArray
{
    public static void main(String[] args){
        findMaxV1(); //method call
/*
create version 2 with dynamic array

Scanner
Buffered reader
 */

    }

    private static void findMaxV1() {
        int[] array = {5,8,4,2,3};
        int maxNumber = array[0];

        for (int i=1;i<array.length;i++){

//            if(array[i] > maxNumber){
//                maxNumber= array[i];
//            }

         maxNumber=   Math.max(maxNumber,array[i]);
        }

        System.out.println("maxNumber:::"+maxNumber);
    }
}
