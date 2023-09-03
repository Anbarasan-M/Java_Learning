package com.practice.problems;

import java.util.Arrays;

//public class ReverseString {
//    public static void main(String[] args){
//        String[] string = {"h", "e", "l", "l", "o"};
//        int first = 0;
//        int last = string.length - 1;
//        while(first < last){
//            String temp = string[first];
//            string[first] = string[last];
//            string[last] = temp;
//            first++;
//            last--;
//        }
//        System.out.println(Arrays.toString(string));
//    }
//}
public class ReverseString{
    public static void main(String[] args){
        String string = "hello";
        String ans = "";
        for(int i = string.length() - 1; i>=0; i--){
            ans += string.charAt(i);
        }
        System.out.println(ans);
    }
}