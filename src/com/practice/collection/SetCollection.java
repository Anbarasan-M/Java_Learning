package com.practice.collection;

import java.util.*;

public class SetCollection
{
    public static void main(String[] args)
    {
        Set<Integer> elements = new LinkedHashSet<>();

        elements.add(2342);
        elements.add(432);
        elements.add(123);
        elements.add(21);
        elements.add(21);

        System.out.println(elements.size());
        int evenCount = 0;
        for (int i : elements)
        {
            if (i % 2 == 0)
            {
                evenCount += 1;
            }

        }
        System.out.println(evenCount);
    }
}
