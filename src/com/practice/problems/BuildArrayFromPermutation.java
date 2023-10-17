package com.practice.problems;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args)
    {
        int [] result = BuildArrayFromPermutation.buildArray(new int[]{0, 1, 2, 5, 3, 4});
        System.out.println(Arrays.toString(result));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i ++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
