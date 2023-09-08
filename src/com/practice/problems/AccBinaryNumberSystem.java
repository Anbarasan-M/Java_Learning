package com.practice.problems;

import java.util.Scanner;

public class AccBinaryNumberSystem {
    public static int binaryOperation(String s){
        int res = s.charAt(0) - '0';
        for(int i = 1; i < s.length();){
            char letter = s.charAt(i);
            i++;
            if(letter == 'A'){
                res &= s.charAt(i) - '0';
            }
            else if(letter == 'B'){
                res |= s.charAt(i) - '0';
            }else if(letter == 'C'){
                res ^= s.charAt(i) - '0';
            }
            i++;
        }
        return res;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sequence");
        String s = sc.next();

        System.out.println(binaryOperation(s));
    }
}
