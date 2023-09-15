package com.practice.collection;
import java.util.Iterator;
import java.util.Set;

public class HashSetSample
{
    public static void main(String [] args)
    {
        Set<String> names = new java.util.HashSet<>();

        names.add("Kowsalya");
        names.add("Gowri");
        names.add("Kalayarasan");
        names.add("Anbarasan");
        names.add("Anbarasan");  // Cannot take duplicates

        Iterator<String> nIterator = names.iterator();

        while(nIterator.hasNext())
        {
            System.out.println(nIterator.next());
        }
    }
}
