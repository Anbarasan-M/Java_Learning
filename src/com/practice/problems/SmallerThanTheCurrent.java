package com.practice.problems;
import java.util.Arrays;

public class SmallerThanTheCurrent
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 4, 3, 5};
        int [] ans = SmallerThanTheCurrent.smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int l = nums.length;
        int [] result = new int[l];
        for (int i = 0; i < l; i ++)
        {
            int count = 0;

            for (int num : nums) {
                if (nums[i] > num) {
                    count += 1;
                }
            }
            result[i] = count;
        }
        return result;
    }
}