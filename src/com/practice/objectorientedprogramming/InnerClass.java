package com.practice.objectorientedprogramming;

import java.io.PrintStream;

class OuterClass{

    int sample;

    public void ocSample(){
        System.out.println("obj in oc");
    }

    static class InnerClass{
        public void icSample(){
            System.out.println("obj in ic");
        }
    }
}
public class InnerClass {
    public static void main(String[] args){

        OuterClass obj = new OuterClass();
        obj.ocSample();

        OuterClass.InnerClass obj1 = new OuterClass.InnerClass();
        obj1.icSample();
    }
}
