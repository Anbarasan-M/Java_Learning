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
