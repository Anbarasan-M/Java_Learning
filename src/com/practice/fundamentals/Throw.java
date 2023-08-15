package com.practice.fundamentals;

class MyException extends Exception     // creating own exception
{
    public MyException(String string)
    {
        super(string);
    }
}
public class Throw {
    public static void main(String[]args)
    {
        int i = 18;
        int j = 20;

        try
        {
            i = i /j;
            if (i == 0)
                throw new MyException("Don't want to print Zero"); // object for our own exception
        }
        catch(MyException e)
        {
            i = i / 1;
            System.out.println(i + " This is in catch  " + e); // this e will show the kind of exception
        }
        catch (ArithmeticException e)
        {
            System.out.println("This will catch arithmetic exception");
        }
    }
}
