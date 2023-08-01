package com.practice.fundamentals;

//final class FinalClass
class FinalClass
{
    public final void test()
    {
       System.out.println("FinalClass");
    }
}
// class ThisClass extends FinalClass --> cannot extend final class
// {
//
// }
class FinalMethod extends FinalClass
{
//    public void test()   -->  This is not possible as test method is mentioned as a final method
}


public class FinalKeyword {
    public static void main(String[] args)
    {
        final int var = 3;
//        var = 2;     this line leads to error because var is mentioned as final variable
        FinalMethod obj = new FinalMethod();
        obj.test();
    }
}
