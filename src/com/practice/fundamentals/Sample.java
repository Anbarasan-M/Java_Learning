package com.practice.fundamentals;

import java.util.Scanner;

public class Sample{
    public static void main(String[]args){
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder newString = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            newString.append(s.charAt(i));
        }
        if(s.equals(newString.toString())){
            System.out.println("Hurray it is a Palindrome");
        }
        else{
            System.out.println("Aloha it is not a Palindrome");
        }
    }
}