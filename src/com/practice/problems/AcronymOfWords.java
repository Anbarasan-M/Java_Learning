package com.practice.problems;

import java.util.ArrayList;
import java.util.List;

class AOWSolution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder ans = new StringBuilder();
        for (String i:words){
            char j = i.charAt(0);
            ans.append(j);
        }
        return ans.toString().equals(s);
    }
}
public class AcronymOfWords {
    public static void main(String [] args){
        List<String> words = new ArrayList<>();
        words.add("allice");
        words.add("bob");
        words.add("charlie");
        AOWSolution obj = new AOWSolution();
        boolean result = obj.isAcronym(words, "abc");
        System.out.println(result);
    }
}
