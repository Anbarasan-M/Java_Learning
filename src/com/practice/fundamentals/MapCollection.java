package com.practice.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class MapCollection
{
    public static void main(String[] args)
    {
        Map<String, Integer> students = new HashMap<>();
//        When multiple threads are working, it is better to use hash table because it is synchronized. They provide similar output

        students.put("Anbarasan", 21);
        students.put("Abishek", 28);
        students.put("Kathir", 81);
        students.put("Kumaravel", 91);
        students.put("Gopal", 51);

        System.out.println(students.keySet());

        for (String name : students.keySet())
        {
            System.out.println(name + " " + students.get(name));
        }
    }
}
