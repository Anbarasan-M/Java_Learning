package com.practice.problems;
import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n1 = 0; int n2 = 1;
        for (int i = 1; i < number; i ++)
        {
            System.out.println(n1);
            int nth = n1+n2;
            n1 = n2;
            n2 = nth;
        }
    }
}
