package com.practice.fundamentals;

public class TryCatch {
    public static void main(String[] args){
        int i = 12;
        int j = 0;
        try{
            i = i/j;
        } catch (Exception e) {
            System.out.println("Operation invalid  -->" + e);
        }
    }
}
