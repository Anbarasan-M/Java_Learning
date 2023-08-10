package com.practice.fundamentals;

public class Throw {
    public static void main(String[]args)
    {
        int i = 0;
        int j = 0;

        try
        {
            j = i/j;
            if (j==0)
                throw new ArithmeticException("THis is throw"); // throw pushes an exception itself
        }
        catch (ArithmeticException e)
        {
            j = i/1;
            System.out.println("Arithmetic error " +  e);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}
