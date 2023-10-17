package com.practice.problems;

public class ArrayStringsAreEquivalent {
    public static void main(String[] args) {
        boolean result = ArrayStringsAreEquivalent.arrayStringsAreEqual(new String[]{"ab", "c"},new String[]{"a", "bc"});
        System.out.println(result);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(String s1:word1) {
            str1 = str1.concat(s1);
        }
        for(String s2:word2) {
            str2 = str2.concat(s2);
        }
        return str1.equals(str2);
    }
}
