package com.practice.problems;

import java.util.Scanner;

public class AccPasswordChecker {
    public int passwordChecker(String s, int n){

        if(n<4){
            return 0;
        }
        if(s.charAt(0) < '0' && s.charAt(0) > '9'){
            return 0;
        }
        int numeric_count = 0;
        int capital = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '/' || s.charAt(i) == ' '){
                return 0;
            }
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                capital += 1;
            }
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                numeric_count += 1;
            }
        }
        if(numeric_count>0 && capital>0){
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String s = sc.next();
        AccPasswordChecker obj = new AccPasswordChecker();
        int result = obj.passwordChecker(s, s.length());
        System.out.println(result);
    }
}
