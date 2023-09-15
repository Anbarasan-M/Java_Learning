package com.practice.problems;


import java.util.HashSet;

class LPSolution{
    public int lpSolution(String s){
        if(s==null || s.length()==0){return 0;}
        HashSet<Character> hs =  new HashSet<Character>();
        int count = 0;

        for(int i=0; i<s.length(); i++){

            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()){return count*2+1;
    }
        return count*2;
}
    }
public class LongestPalindrome {
    public static void main(String[] args){

        LPSolution obj = new LPSolution();
        int result = obj.lpSolution("abccccdd");
        System.out.println(result);
    }
}
