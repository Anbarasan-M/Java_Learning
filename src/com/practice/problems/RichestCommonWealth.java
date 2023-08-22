package com.practice.problems;

public class RichestCommonWealth
{
    public static void main(String[] args)
    {
        int [][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int l = accounts.length;
        int result = 0;
        for (int[] account : accounts) {
            int temp = 0;
            for (int ignored : account) {
                temp += ignored;
            }
            result = Math.max(temp, result);
        }
        System.out.println(result);
    }
}
