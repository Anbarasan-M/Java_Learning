package com.practice.problems;
import java.util.ArrayList;
import java.util.List;

public class AcronymOfWords {
    public static void main(String [] args){
        List<String> words = new ArrayList<>();
        words.add("allice");
        words.add("bob");
        words.add("charlie");
        boolean result = AcronymOfWords.isAcronym(words, "abc");
        System.out.println(result);
    }
    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder ans = new StringBuilder();
        for (String i:words){
            char j = i.charAt(0);
            ans.append(j);
        }
        return ans.toString().equals(s);
    }
}
