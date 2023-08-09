package com.practice.objectorientedprogramming;

interface CComputer
{
    default void code()
    {

    }
}
class LLaptop implements CComputer
{
    public void code()
    {
        System.out.println("Code, compile, run");
    }
}
class DDesktop implements CComputer
{
    public void code()
    {
        System.out.println("code, compile, run, faster");
    }
}
class DDeveloper
{
    public void devApp(CComputer comp)
    {
        comp.code();
    }
}
public class NeedForInterface
{
    public static void main(String[] args)
    {
        CComputer lap = new LLaptop();
        CComputer desk = new DDesktop();

        desk.code();
        lap.code();

        DDeveloper anbu = new DDeveloper();

        anbu.devApp(desk);

    }
}
