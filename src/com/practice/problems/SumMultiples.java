package com.practice.problems;

public class SumMultiples {
    public static void main(String[] args)
    {

        int result = SumMultiples.sumOfMultiples(7);
        System.out.println(result);
    }
    public static int sumOfMultiples(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i ++)
        {
            if (i %3 == 0 || i%5 == 0 || i%7 == 0)
            {
                ans += i;
            }
        }
        return ans;
    }
}
