package com.practice.problems;
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 1;
        for (int i = 1; i <= number; i ++){
            answer *= i;
        }System.out.println(answer);
    }
}
