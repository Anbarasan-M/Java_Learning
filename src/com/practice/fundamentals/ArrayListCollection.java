package com.practice.fundamentals;

import java.util.*;

public class ArrayListCollection
{
    public static void main(String[] args)
    {
        // ArrayList
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

    }
}
