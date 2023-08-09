package com.practice.problems;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args)
    {
    int [] nums = {3,2,2,3};
    int val = 3;
    int i = 0;
    int j = 0;
    while (i < nums.length) {
        int first = nums[i];
        int second = nums[j];
        if (first == val) {
            i += 1;
        } else {
            second = first;
            i += 1;
            j += 1;
        }
    }
    System.out.println(j);
    System.out.println(Arrays.toString(nums));
    }
}
