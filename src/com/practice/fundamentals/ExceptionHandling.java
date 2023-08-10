package com.practice.fundamentals;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int i = 18;
        int j = 0;

        int [] num = new int[5];

        try {
            j = i/j;
            System.out.println(num[5]);
        }
        catch (Exception e){
            System.out.print("This is an invalid expression " + e); // e allows to write the exception as well
        }
        System.out.println(j);
        System.out.println("Executed");

    }
}
