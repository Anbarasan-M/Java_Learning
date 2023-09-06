package com.practice.problems;

class BalSSolution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                count += 1;
            }
            else{
                count -= 1;
            }
            if (count == 0){
                res += 1;
            }
        }
        return res;
    }
}
public class BalancedString {
    public static void main(String[] args){

        BalSSolution obj = new BalSSolution();
        System.out.println(obj.balancedStringSplit("LLRRLRRLL"));
    }
}
