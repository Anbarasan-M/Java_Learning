package com.practice.problems;

public class EvenDigitSum
{
    public static void main(String[] args)
    {
        int [] nums = {12, 2345, 1, 34, 90988, 2};
        int ans = 0;

        for (int i = 0; i < nums.length; i ++)
        {
            int count = 0;
            int num = nums[i];

            while (num != 0)
            {
                num = num / 10;
                count += 1;
            }
            if (count % 2 == 0)
            {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
