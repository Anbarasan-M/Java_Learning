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
        Set<Integer> integers = new TreeSet<Integer>();

        integers.add(12);
        integers.add(81);
        integers.add(27);
        integers.add(85);
        integers.add(85);

        List<Integer> integers1 = new ArrayList<>(integers);
        Collections.sort(integers1);// This line is replaced by the following line
        integers1.sort(comp);
        System.out.println(integers);
    }
}
