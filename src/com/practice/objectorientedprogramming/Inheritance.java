package com.practice.objectorientedprogramming;

class calc
{
    public int add(int x, int y)
    {
        return x+y;
    }
    public int sub(int x, int y)
    {
        return x - y;
    }
}

class AdCalc extends calc // Single Level Inheritance
{
    public int mul(int x, int y)
    {
        return x * y;
    }
    public int div(int x, int y)
    {
        return x/y;
    }
}
class MostAdCalc extends AdCalc // Multilevel Inheritance
{
    public double power( int x, int y)
    {
        return Math.pow(x, y);
    }
}
public class Inheritance {
    public static void main(String []args)
    {
        MostAdCalc obj = new MostAdCalc();
        int a = obj.add(4, 2);
        int b = obj.sub(4, 2);
        int c = obj.mul(4, 2);
        int d = obj.div(4, 2);
        double e = obj.power(4, 2);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}
