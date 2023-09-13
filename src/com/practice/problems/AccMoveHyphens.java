package com.practice.problems;

public class AccMoveHyphens {
    public static void main(String[] args){

        String string = "Move-Hyphens-to-Front";
        String ans = "";

        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == '-'){
                ans = string.charAt(i) + ans;
                i++;
            }
            else;
            {
                ans += string.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
