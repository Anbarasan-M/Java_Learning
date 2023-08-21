package com.practice.problems;
import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        int count = 0;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i ++)
        {
            if (n % i == 0)
            {
                count = 1;
                System.out.println("Not a prime");
                break;
            }
        }
        if (count == 0)
        {
            System.out.println("It is a prime number");
    }
    }
}
