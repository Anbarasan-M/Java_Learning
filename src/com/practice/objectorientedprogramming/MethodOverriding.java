package com.practice.objectorientedprogramming;

class Calc1
{
    int x = 2;
    int y = 4;
    public int add()
    {
        return x + y;
    }
}
class AdvCalc extends Calc1
{
    public int add()
    {
        return x+y+1;
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
        AdvCalc obj = new AdvCalc();
        int r = obj.add();
        System.out.println(r);
    }
}
