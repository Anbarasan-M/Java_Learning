package com.practice.fundamentals;

class SubThrow
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Ewa");
    }
}
public class Throws
{
    public static void main(String[] args)
    {
        SubThrow obj = new SubThrow();
        try
        {
            obj.show();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
