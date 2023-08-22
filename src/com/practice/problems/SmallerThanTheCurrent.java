package com.practice.problems;

import java.util.Arrays;

class SNTCSolution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l = nums.length;
        int [] result = new int[l];
        for (int i = 0; i < l; i ++)
        {
            int count = 0;

            for (int j = 0; j < l; j ++)
            {
                if (nums[i] > nums[j] )
                {
                    count += 1;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
public class SmallerThanTheCurrent
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 4, 3, 5};
        SNTCSolution obj = new SNTCSolution();
        int [] ans = obj.smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(ans));
    }
}