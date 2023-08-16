package com.practice.fundamentals;//package com.practice.fundamentals;
//
//interface Computer1{
//    void code();
//}
//class Lap implements Computer1{
//    public void code(){
//        System.out.println("Helps to code in moderate speed");
//    }
//}
//class Desk implements Computer1{
//    public void code(){
//        System.out.println("Helps to code faster");
//    }
//}
//class Person{
//    public void devApp(Computer1 comp){
//        comp.code();
//    }
//}
//public class Sample{
//    public static void main(String[] args)
//    {
//        Lap lap = new Lap();
//        Desk desk = new Desk();
//
//        Person obj = new Person();
//        obj.devApp(lap);
//        obj.devApp(desk);
//    }
//}



//import java.util.Scanner;
//
//public class Sample
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
//    }
//}

//public class Sample extends Thread
//{
//    public static void main(String[] args)
//    {
//        Sample thread = new Sample();
//        thread.start();
//
//
//        System.out.println("THis is outside thread");
//    }
//    public void run(){
//        System.out.println("This is inside thread");
//    }
//}

import sun.rmi.runtime.NewThreadAction;

//class Counter
//{
//    int count;
//    public synchronized void increment()  // Synchronized is used to fetch one value at a time to provide a meaningful proper output
//    {
//        count ++;
//    }
//}
//public class Sample
//{
//    public static void main(String[] args) throws InterruptedException {
//        Counter c = new Counter();
//        Runnable obj1 = () ->
//        {
//            for (int i = 0; i <= 1000; i ++){
//                c.increment();
//            }
//        };
//        Runnable obj2 = () ->
//        {
//            for (int i = 0; i <= 1000; i ++)
//            {
//                c.increment();
//            }
//        };
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(c.count);
//    }
//}

public class Sample
{
    public static void main(String[]args){

    }
}