package com.practice.fundamentals;

import java.util.*;

public class SortingInJava
{
    public static void main(String[] args)
    {
        Comparator<Integer> comp = new Comparator<Integer>() // Integer hs to be mentioned on both the sides
        {
            public int compare(Integer i, Integer j)
            {
                if (i % 10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(81);
        nums.add(27);
        nums.add(85);

//        Collections.sort(nums, comp); This line is replaced by the following line
        nums.sort(comp);
        System.out.println(nums);
    }
}
