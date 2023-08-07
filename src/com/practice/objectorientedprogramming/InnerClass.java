package com.practice.objectorientedprogramming;

import java.io.PrintStream;

class OuterClass{

    int sample;

    public void ocSample(){
        System.out.println("obj in oc");
    }

    static class InnerClass{   // it is a class inside a class, and it should be static for ease of access
        public void icSample(){
            System.out.println("obj in ic");
        }
    }
}
public class InnerClass {
    public static void main(String[] args){

        OuterClass obj = new OuterClass();
        obj.ocSample();

        OuterClass.InnerClass obj1 = new OuterClass.InnerClass(); // By this way we can access the method inside an inner class
        obj1.icSample();
    }
}
