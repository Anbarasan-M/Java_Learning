package com.practice.problems;
class TSSolution
{
    public String truncateSentence(String s, int k){
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

public class TruncateSentence {
    public static void main(String[] args) {
        TSSolution obj = new TSSolution();
        String result = obj.truncateSentence("Hello how are you Contestant", 4);
        System.out.println(result);
    }
}

