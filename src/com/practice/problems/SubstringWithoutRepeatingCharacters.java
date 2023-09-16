package com.practice.problems;

import java.util.HashMap;

class SWRCSolution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;

    }
}
public class SubstringWithoutRepeatingCharacters {
        public static void main(String[] args){

            SWRCSolution obj = new SWRCSolution();
            int result = obj.lengthOfLongestSubstring("asdfghhhqwerty");
            System.out.println(result);

        }
}

