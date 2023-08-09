package com.practice.problems;

public class RemoveElements {
    public static void main(String[] args)
    {
    int [] nums = {3,2,2,3};
    int val = 3;
    int i = 0;
    int j = 0;
    while (i < nums.length)
    {
        int num = nums[i];
        int rem = nums[j];
        if (num == val )
        {
            j ++;
        }
        else{
            num = rem;
           i ++;
           j ++;
        }

    }System.out.println(j);

    }
}
