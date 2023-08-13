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
        System.out.println(s.ordinal());

        // for loop in enum
        Status [] ss = Status.values();
        for(Status i:ss)
        {
            System.out.println(i);
        }

        // switch in enum
        switch (s){
            case Failed:
                System.out.println("failed Try again");
                break;
            case Running:
                System.out.println("Working on it");
                break;
            case Pending:
                System.out.println("Maybe later");
                break;
            case Success:
                System.out.println("Mission accomplished");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
