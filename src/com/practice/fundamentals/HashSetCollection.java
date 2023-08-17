package com.practice.fundamentals;

import java.util.*;

public class HashSetCollection
{
    public static void main(String[] args)
    {

        Set<Integer> nums = new HashSet<>();
        Collection<Integer> num = new TreeSet<>(); // Represented like this as well, but it is ordered
        nums.add(34);
        nums.add(42);
        nums.add(61);
        nums.add(88);

        System.out.println(nums);

//        for (int n:nums)
//        {
//            System.out.println(n);
//        }
//        It can be represented like below shown method

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
