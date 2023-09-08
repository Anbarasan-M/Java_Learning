package com.practice.problems;

import java.util.Scanner;

public class AccAbsoluteDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diff");
        int diff = sc.nextInt();
        System.out.println("Enter num");
        int num = sc.nextInt();
        System.out.println("Enter length");
        int n = sc.nextInt();
        System.out.println("Enter elements in an array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] >= num -diff && arr[i] <= num + diff){
                count +=1;
            }
        }
        if(count != 0) {
            System.out.println("The answer is  " + count);
        }
        else{
            System.out.println("The answer is  " + -1);
        }
    }
}
