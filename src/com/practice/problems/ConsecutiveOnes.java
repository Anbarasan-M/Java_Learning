package com.practice.problems;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int [] list = {1, 0, 1, 1, 1, 0, 2, 1};
        int ans = 0;
        int count = 0;
        for (int j : list) {
            if (j == 1) {
                count += 1;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }
        System.out.println(ans);
    }
}
