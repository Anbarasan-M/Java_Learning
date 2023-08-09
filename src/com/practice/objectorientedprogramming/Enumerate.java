package com.practice.objectorientedprogramming;

enum Status
{
    Running, Failed, Pending, Success;
}
public class Enumerate
{
    public static void main(String[]args)
    {
        Status s = Status.Running;
        System.out.println(s);

        // for loop in enum
        Status [] ss = Status.values();
        for(Status i:ss)
        {
            System.out.println(i);
        }

        // switch in enum
        switch (s){
            case Failed:
                System.out.println("Try again");
            case Running:
            System.out.println("Try again");
            case Pending:
            System.out.println("Try again");
            default:
            System.out.println("Try again");
        }
    }
}
