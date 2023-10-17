package com.practice.problems;

public class TruncateSentence {
    public static void main(String[] args) {
        String result = TruncateSentence.truncateSentence("Hello how are you Contestant", 4);
        System.out.println(result);
    }
    public static String truncateSentence(String s, int k){
        String[] words = s.split(" ");
        StringBuilder truncated = new StringBuilder();

        if (k >= s.length()){
            return s;
        }
        else{
            for (int i = 0; i < k; i ++) {
                truncated.append(words[i]);
                if (i < k - 1) {
                    truncated.append(" ");
                }
            }
        }
        return truncated.toString();
    }
}

