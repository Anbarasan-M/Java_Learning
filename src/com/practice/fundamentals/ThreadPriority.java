package com.practice.fundamentals;

class A extends Thread{
    public void run(){
        for(int i = 0; i<=100; i++) {
            System.out.println("This is in A thread");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0; i<=100; i++) {
            System.out.println("This is in B thread");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args){
        A obj = new A();
        B obj1 = new B();

//        obj1.setPriority(Thread.MAX_PRIORITY);

        obj.start();
        obj1.start();
    }
}
