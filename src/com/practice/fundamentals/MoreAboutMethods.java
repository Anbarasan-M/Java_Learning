package com.practice.fundamentals;

class Calculator{
    public int addNum(int n1, int n2)
    {
        return n1 + n2;
    }
    public int addNum(int n1, int n2, int n3)  // This step is method overloading (Increasing the number of parameters in a method)
    {
        return n1 + n2 + n3;
    }
    public double addNum(double n1, int n2)  // This step is method overriding (Changing the parameter types)
    {
        return n1 + n2;
    }
}
public class MoreAboutMethods
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        double ans = calc.addNum(3.4, 5);
        System.out.println(ans);
    }
}
