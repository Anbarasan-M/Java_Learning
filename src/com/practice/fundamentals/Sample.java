package com.practice.fundamentals;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sample extends Thread{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter numbers:");
        int n = 10;
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[n];
       for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
       }
       System.out.println(Arrays.toString(arr));
    }
}