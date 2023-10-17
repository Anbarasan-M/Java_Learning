package com.practice.problems;

import java.util.ArrayList;
import java.util.List;

public class SumLessThanTarget
{
    public static void main(String[] args)
    {
        List <Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        int result = SumLessThanTarget.countPairs(nums, 2);
        System.out.println(result);
    }
    public static int countPairs(List<Integer> nums, int target) {
        int result = 0;
        int length = nums.size();
        for (int i = 0; i < length; i ++)
        {
            for (int j = i +1; j < length; j ++)
            {
                if ((nums.get(i) + nums.get(j) < target))
                {
                    result += 1;
                }
            }
        }
        return result;
    }
}
