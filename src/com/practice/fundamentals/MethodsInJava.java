package com.practice.fundamentals;

class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing... ");
    }
    public String returnString(int i)
    {
        if (i==5)
            return "A string has been returned";
        return "Not a valid input";
    }
}
public class MethodsInJava
{
    public static void main(String []args)
    {
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.returnString(7);
        System.out.println(str);
    }
}
