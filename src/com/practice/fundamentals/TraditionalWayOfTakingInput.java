package com.practice.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TraditionalWayOfTakingInput
{
    public static void main(String [] args) throws IOException
    {
        System.out.println("Enter The NUmber");

        InputStreamReader in = new InputStreamReader(System.in);

        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());

        System.out.println("The given number is " + num);
    }
}
