package com.practice.fundamentals;
import java.sql.*;

public class Sample{
    public static void main(String[] args){
        int i = 18;
        int j = 0;

        try{
            j = i/j;
            if(j==0)
                throw new ArithmeticException("Don't want to print zero");
            }
        catch (ArithmeticException e){
            j = i/1;
            System.out.println("this will be printed " + j);
        }
    }
}