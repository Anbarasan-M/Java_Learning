package com.practice.fundamentals;

class Factorial
{
    public int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
}
public class Recursion
{
    public static void main(String[] args)
    {
        Factorial obj = new Factorial();
        int result = obj.factorial(5);
        System.out.println(result);
    }
}
