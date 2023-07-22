package com.practice.fundamentals;

class casting_conversion_promotion{
    public static void main(String []args)
    {
//        Let's perform conversion (Directly converting elements into another datatype)
        byte a = 123;
        int b = a;
        System.out.println(b);
//        Let's perform casting    (Converting elements into another datatype by explicit conversion)
        int a1 = 23;
        byte b1 = (byte) a1;
        System.out.println(b1);
//        Type promotion           (Automatically changing into another datatype)
        byte e = 12;
        byte r = 12;
        int t = e+r;
        System.out.println("test add::"+t);
    }

}