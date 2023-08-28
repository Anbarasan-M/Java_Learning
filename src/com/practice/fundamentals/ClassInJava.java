package com.practice.fundamentals;

class Calculators1
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

class JavaClass
{
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 4;

        Calculators1 calc = new Calculators1();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}