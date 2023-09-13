package com.practice.problems;

import java.util.Scanner;

public class AccOperationChoices {

    public static int operationChoices(int a, int b, int c){

        if(c == 1){
            return a+b;
        }else if(c == 2){
            return a*b;
        }else if(c == 3){
            return a/b;
        }else{
            return -1;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        System.out.println(operationChoices(a, b, c));

    }
}
