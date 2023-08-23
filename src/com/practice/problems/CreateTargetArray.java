package com.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray
{
    public int[] createTargetArray(int[] nums, int[] index)
    {
        ArrayList<Integer> value = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            value.add(index[i], nums[i]);
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = value.get(i);
        }
        return ans;
    }
}
class CTASolution
{
    public static void main(String[] args)
    {
        CreateTargetArray obj = new CreateTargetArray();

        int [] result = obj.createTargetArray(new int []{0, 1, 2, 3, 4},new int []{0, 1, 2, 2, 1});

        System.out.println(Arrays.toString(result));
    }
}