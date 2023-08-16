package com.practice.fundamentals;
//
//class FirstThread implements Runnable // It is derived from -> class FirstThread extends Thread
//{
//    public void run()
//    {
//        for (int i = 1; i <= 5; i ++)
//        {
//            System.out.println("Hi");
//            try{
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class SecondThread implements Runnable   // It is derived from -> class SecondThread extends Thread
//{
//    public void run()
//    {
//        for (int i = 1; i <= 5; i ++)
//        {
//            System.out.println("Hello");
//            try{
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}   ---> No need for those two class after creating lambda expression
public class ThreadOperation
{
    public static void main(String[] args)
    {
//        Runnable obj1 = new FirstThread();  // It should be passed to thread, Thread constructor contains runnable objects so FirstThread obj becomes Runnable obj
//        Runnable obj2 = new SecondThread();

//        Runnable is a functional interface so we can use lambda

//        Runnable obj1 = new Runnable() Not required for lambda
        Runnable obj1 = () ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable obj2 = () ->
        {
            for (int i = 1; i <= 5; i ++)
            {
                System.out.println("Hello");
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // System.out.println(obj1.getPriority());  This line gets the priority of the thread

        //System.out.println(obj2.setPriority(Thread.MAX_PRIORITY);  This line sets the max priority

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
