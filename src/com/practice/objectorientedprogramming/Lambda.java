package com.practice.objectorientedprogramming;

interface Inter
{
    void show(int i);
}

public class Lambda
{
    public static void main(String[] args)
    {
        Inter obj = (i) -> System.out.print("Lambda" + " " + i);
        obj.show(5);
    }
}