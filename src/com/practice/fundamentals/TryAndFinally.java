package com.practice.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TryAndFinally
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        int num = 0;
        BufferedReader br = null;
        try
        {
            System.out.println("Enter the number");

            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());

            System.out.println("The given num is " + num);
        }
        finally
        {
            br.close();
        }
    }
}
