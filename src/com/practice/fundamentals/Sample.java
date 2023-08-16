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

public class Sample extends Thread
{
    public static void main(String[] args)
    {
        Sample thread = new Sample();
        thread.start();


        System.out.println("THis is outside thread");
    }
    public void run(){
        System.out.println("This is inside thread");
    }
}