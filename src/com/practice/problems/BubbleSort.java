package com.practice.problems;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int [] numbers = {12, 8, 34, 1, 39, 5 };
        for (int i = 0; i < numbers.length; i ++)
        {
            for (int j = i + 1; j < numbers.length; j ++)
            {
                if (numbers[j] < numbers[i])
                {
                    int q = numbers[i];
                    int w = numbers[j];
                    numbers[i] = w;
                    numbers[j] = q;
                }
            }
        }System.out.println(Arrays.toString(numbers));
    }
}
