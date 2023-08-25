package com.practice.fundamentals;
class ASAESolution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
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
public class Sample {
    public static void main(String[] args) {
        ASAESolution obj = new ASAESolution();
        boolean result = obj.arrayStringsAreEqual(new String[]{"ab", "c"},new String[]{"a", "bc"});
        System.out.println(result);
    }
}