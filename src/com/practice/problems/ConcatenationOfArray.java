package com.practice.problems;

import java.util.Arrays;

class COASolution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[2*(nums.length)];
        int middle = nums.length;

        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[i];
            ans[middle] = nums[i];
            middle += 1;
        }
        return ans;
    }
}
public class ConcatenationOfArray
{
    public static void main(String[] args)
    {
        COASolution obj = new COASolution();
        int []result = obj.getConcatenation(new int[] {1, 2, 1});
        System.out.println(Arrays.toString(result));
    }
}
