package com.practice.problems;

class SMSolution {
    public int sumOfMultiples(int n) {
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
public class SumMultiples {
    public static void main(String[] args)
    {
        SMSolution obj = new SMSolution();

        int result = obj.sumOfMultiples(7);

        System.out.println(result);
    }
}
