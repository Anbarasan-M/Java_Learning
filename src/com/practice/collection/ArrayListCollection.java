package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCollection
{
    public static void main(String[] args)
    {
        // ArrayList
        //Collection<Integer> array = new ArrayList<>();  Arraylist is a class which implements a list
        List<Object> array = new ArrayList<>();

        // If you just want to add and use values, collection is suitable
        // If you want to perform operations using index values list is suitable

        array.add(2);
        array.add(4);
        array.add(10);
        array.add(8);
        array.add("Anbu");

        System.out.println(array.get(0));
        System.out.println(array.indexOf(6));
        System.out.println(Arrays.toString(array.toArray()));

    }
}
