package com.practice.problems;

import java.util.Arrays;

class BAFPSolution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i ++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
public class BuildArrayFromPermutation {
    public static void main(String[] args)
    {
        BAFPSolution obj = new BAFPSolution();
        int [] result = obj.buildArray(new int[]{0, 1, 2, 5, 3, 4});
        System.out.println(Arrays.toString(result));
    }
}
