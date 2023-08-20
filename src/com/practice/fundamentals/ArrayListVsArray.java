package com.practice.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListVsArray
{
    public static void main(String[] args)
    {
        // Array should contain similar data types else it will show compile time error

        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[3]);

        // Array is mutable but the size cannot be changed
        numbers[2] = 21;
        System.out.println(Arrays.toString(numbers));

        // An Array list can contain element with any data in a same array like given velow
        List<Object> elements =new ArrayList<>();
        elements.add("a");
        elements.add(21);
        for (Object n: elements)
        {
            System.out.println(n);
        }
    }
}