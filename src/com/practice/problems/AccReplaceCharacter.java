package com.practice.problems;

public class AccReplaceCharacter {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer();
        String string = "apples";
        char str1 = 'a';
        char str2 = 'p';

        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == 'a'){
                sb.append(str2);
            }
            else if(string.charAt(i) == 'p'){
                sb.append(str1);
            }
            else{
                sb.append(string.charAt(i));
            }
        }
        System.out.println(sb);

    }
}
