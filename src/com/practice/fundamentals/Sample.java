package com.practice.fundamentals;

import java.util.Scanner;

class InputDemo
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("what is your name? ");
        String name = scanner.next();
        System.out.println("hello" + name);
    }
}