package com.practice.fundamentals;

import java.util.*;

public class CollectionInJava
{
    public static void main(String[] args)
    {
        //Collection<Integer> array = new ArrayList<>();  Arraylist is a class which implements a list
        List<Integer> array = new ArrayList<>();

        // If you just want to add and use values, collection is suitable
        // If you want to perform operations using index values list is suitable

        array.add(2);
        array.add(4);
        array.add(6);
        array.add(8);

        System.out.println(array.get(0));
        System.out.println(array.indexOf(6));
        System.out.println(array);

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

        while (values.hasNext())
        {
            System.out.println(values.next());
        }
    }
}
