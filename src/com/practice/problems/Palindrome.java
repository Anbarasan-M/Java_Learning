package com.practice.problems;
import  java.util.Scanner;
import java.util.Arrays;
public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter the word");
        int flag = 0;
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int left = 0; int right = s.length() - 1;
        while (left != right)
        {
            char left_char = s.charAt(left);
            char right_char = s.charAt(right);
            if (left_char == right_char)
            {
                left +=1;
                right -= 1;
            }
            else{
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("Palindrome");
        }else
        {
            System.out.println("Not a Palindrome");
        }
    }
}

//import java.util.Scanner;
//
//public class Sample{
//    public static void main(String[]args){
//        System.out.println("Enter the String");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        StringBuilder newString = new StringBuilder();
//        for(int i = s.length()-1; i >= 0; i--){
//            newString.append(s.charAt(i));
//        }
//        if(s.equals(newString.toString())){
//            System.out.println("Hurray it is a Palindrome");
//        }
//        else{
//            System.out.println("Aloha it is not a Palindrome");
//        }
//    }
//}